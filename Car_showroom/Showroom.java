import java.util.*;

public class Showroom implements utility{
	String showroom_name;
	String showroom_address;
	String manager_name;
	int total_emp=0;
	int total_cars=0;

	public void getdetails(){
		System.out.println("Showroom_name: "+showroom_name);
		System.out.println("Showroom_address: "+showroom_address);
		System.out.println("Manager_name: "+manager_name);
		System.out.println("Total_Employee: "+total_emp);
		System.out.println("Total_cars: "+total_cars);
	}
	public void setdetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("========Enter details:==========");
		System.out.println("enter showroom name:");
		showroom_name=sc.nextLine();
		System.out.println("enter showroom_address:");
		showroom_address=sc.nextLine();
		System.out.println("enter manager_name:");
		manager_name=sc.nextLine();
		System.out.println("enter total employees:");
		total_emp=sc.nextInt();
		System.out.println("enter total no of cars:");
		total_cars=sc.nextInt();
	}
}