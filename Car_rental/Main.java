import java.util.ArrayList;
import java.util.*;
class Car{
	private String carId;
	private String brand;
	private String model;
	private double basepricepreday;
	private boolean isAvailable;
	public Car(String carId,String brand,String model,double basepricepreday,boolean isAvailable){
		this.carId=carId;
		this.brand=brand;
		this.model=model;
		this.basepricepreday=basepricepreday;
		this.isAvailable=true;
	}
	public String getCarId(){
		return carId;
	}
	public String getBrand(){
		return brand;
	}
	public String getModel(){
		return model;
	}
	public boolean isAvailable(){
		return isAvailable;
	}
	public double calculatePrice(int rentalDays){
		return basepricepreday*rentalDays;
	}
	public void rent(){
		isAvailable=false;
	}
	public void returnCar(){
		isAvailable=true;
	}

}

class Customer{
	private String name;
	private String customer_id;
	public Customer(String customer_id,String name){
		this.customer_id=customer_id;
		this.name=name;
	}
	public String getCustomerId(){
		return customer_id;
	}
	public String getName(){
		return name;
	}

}

class Rental{
	private Car car;
	private Customer customer;
	private int days;
	public Rental(Car car,Customer customer,int days){
		this.car=car;
		this.customer=customer;
		this.days=days;
	}
	public Car getCar(){
		return car;
	}
	public Customer getCustomer(){
		return customer;
	}
	public int days(){
		return days;
	}
}

class CarRentalSystem{
	private List<Car> cars;
	private List<Customer> customers;
	private List<Rental> rentals;
	public CarRentalSystem(){
		cars=new ArrayList<>();
		customers=new ArrayList<>();
		rentals=new ArrayList<>();

	}
	public void addCar(Car car){
		cars.add(car);
	}
	public void addCustomer(Customer customer){
		customers.add(customer);
	}
	public void rentCar(Car car,Customer customer,int days){
		if(car.isAvailable()){
			car.rent();
			rentals.add(new Rental(car,customer,days));
		}else{
			System.out.println("car is not available for rent.");
		}
	}
	public void returnCar(Car car){
		car.returnCar();
		Rental rentaltoremove=null;
		for(Rental rental:rentals){
			if(rental.getCar()==car){
				rentaltoremove=rental;
				break;
			}
		}
		if(rentaltoremove!=null){
			rentals.remove(rentaltoremove);
			System.out.println("Car returned successfully.");
		}else{
			System.out.println("Car was not rented.");
		}
	}
	public void menu(){
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("======= Car Rental System ========");
			System.out.println("1. Rent a car");
			System.out.println("2. Return a car");
			System.out.println("3. Exit");
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			sc.nextLine();
			if(choice==1){
				System.out.println("\n==== Rent a car =====\n");
				System.out.print("enter your name:");
				String customername=sc.nextLine();
				System.out.println("\n Available Cars:");
				for(Car car:cars){
					if(car.isAvailable()){
						System.out.println(car.getCarId()+" - "+car.getBrand()+" - "+car.getModel());

					}
				}
				System.out.print("\n Enter the car ID you want to rent:");
				String carId=sc.nextLine();
				System.out.println("Enter the no of days for rent:");
				int rentalDays=sc.nextInt();
				sc.nextLine();
				Customer newcustomer=new Customer("CUS"+(customers.size()+1),customername);
				addCustomer(newcustomer);

				Car selectedcar=null;
				for(Car car:cars){
					if(car.getCarId().equals(carId) && car.isAvailable()){
						selectedcar=car;
						break;
					}
				}
				if(selectedcar!=null){
					double totalPrice=selectedcar.calculatePrice(rentalDays);
					System.out.println("\n == Rental Information ==\n");
					System.out.println("Customer ID:"+newcustomer.getCustomerId());
					System.out.println("Customer Name:"+newcustomer.getName());
					System.out.println("Car:"+selectedcar.getBrand()+" "+selectedcar.getModel());
					System.out.println("Rental days:"+rentalDays);
					System.out.printf("Total Price: $%.2f%n",totalPrice);

					System.out.println("\nConfirms rental(Y/N):");
					String confirm=sc.nextLine();
					if(confirm.equalsIgnoreCase("Y")){
						rentCar(selectedcar,newcustomer,rentalDays);
						System.out.println("\n Car rented successfully.");
					}else{
						System.out.println("\n Rental canceled.");
					}
				}else{
					System.out.println("\nInvalid car selection or car not available for rent.");
				}
			}else if(choice==2){
				System.out.println("\n === Return a car====\n");
				System.out.print("Enter the car ID you want to return:");
				String carId=sc.nextLine();
				Car cartoreturn =null;
				for(Car car:cars){
					if(car.getCarId().equals(carId) && !car.isAvailable()){
						cartoreturn=car;
						break;
					}
				}
				if(cartoreturn!=null){
					Customer customer=null;
					for(Rental rental:rentals){
						if(rental.getCar()==cartoreturn){
							customer=rental.getCustomer();
							break;
						}
					}
					if(customer!=null){
						returnCar(cartoreturn);
						System.out.println("Car returned successfully.");
					}else{
						System.out.println("Car was not rented or rental Information is missing.");
					}
				}else{
					System.out.println("Invalid car ID or car is not rented.");
				}
			}else if(choice==3){
				break;
			}else{
				System.out.println("Invalid choce.");
			}
		}
		System.out.println("\n Thank you for using car rental system!");
	}
}
public class Main{
	public static void main(String[] args) {
		CarRentalSystem rentalSystem=new CarRentalSystem();
		Car c1=new Car("C001","Toyota","Camry",50.0,true);
		Car c2=new Car("C002","Honda","Accord",70.0,true);
		rentalSystem.addCar(c1);
		rentalSystem.addCar(c2);
		rentalSystem.menu();
	}
}