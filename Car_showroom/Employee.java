import java.util.*;

public class Employee extends Showroom implements utility{
	String employee_id;
	String employee_name;
	int age=0;
	String emp_dept;

	public void getdetails(){
		System.out.println("Employee_id: "+employee_id);
		System.out.println("Employee_name: "+employee_name);
		System.out.println("Age: "+age);
		System.out.println("Employee_department: "+emp_dept);
		System.out.println("Showroom_name:"+showroom_name);
	}
	public void setdetails(){
		Scanner sc=new Scanner(System.in);
		UUID uuid=UUID.randomUUID();
		employee_id=String.valueOf(uuid);
		System.out.println("========Enter details:==========");
		System.out.println("enter employee_name:");
		employee_name=sc.nextLine();
		System.out.println("enter age:");
		age=sc.nextInt();
		sc.nextLine();
		System.out.println("enter emp_dept:");
		emp_dept=sc.nextLine();
		System.out.println("Enter showroom_name:");
		showroom_name=sc.nextLine();
	}
}