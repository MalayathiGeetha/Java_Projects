import java.util.*;

public class Cars extends Showroom implements utility{
	String car_name;
	String car_color;
	String car_fuel_type;
	String car_type;
	int car_price;

	public void getdetails(){
		System.out.println("===========Enter car details================");
		System.out.println("Car name: "+car_name);
		System.out.println("Car_color: "+car_color);
		System.out.println("Car_fuel_type:"+car_fuel_type);
		System.out.println("car_type:"+car_type);
		System.out.println("Car_price:"+car_price);

	}
	public void setdetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("===========Enter car details=============");
		System.out.println("Enter car name:");
		car_name=sc.nextLine();
		System.out.println("Enter car color:");
		car_color=sc.nextLine();
		System.out.println("Enter car_type:");
		car_type=sc.nextLine();
		System.out.println("Enter car fuel type:");
		car_fuel_type=sc.nextLine();
		System.out.println("Enter car price:");
		car_price=sc.nextInt();
		sc.nextLine();
		total_cars++;
	}
}