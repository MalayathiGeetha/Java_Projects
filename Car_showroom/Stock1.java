import java.util.*;
import java.lang.*;

interface Utility{
	public void getdetails();
	public void setdetails();
}


public class Stock1{
	public static void main_menu(){
		System.out.println("===========**welcome to our showroom**============");
		System.out.println();
		System.out.println("===============Enter your choice===========");
		System.out.println("1)Add showroom  2) Add Employee  3)Add Cars");
		System.out.println();
		System.out.println("4)Get showroom 5)Get Employee 6)Get cars");
		System.out.println();
		System.out.println("==============Enter 0 to exit=============");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Showroom showroom[]=new Showroom[5];
		Employee employee[]=new Employee[5];
		Cars car[]=new Cars[5];
		int car_counter=0;
		int employee_counter=0;
		int showroom_counter=0;
		int choice=100;
		while(choice!=0){
			main_menu();
			choice=sc.nextInt();
			while(choice!=9 && choice!=0){
				switch(choice){
					case 1:
						showroom[showroom_counter]=new Showroom();
						showroom[showroom_counter].setdetails();
						showroom_counter++;
						System.out.println();
						System.out.println("1).Add new showroom");
						System.out.println("9)Go back to main menu");
						choice=sc.nextInt();
						break;
					case 2:
						employee[employee_counter]=new Employee();
						employee[employee_counter].setdetails();
						employee_counter++;
						System.out.println();
						System.out.println("1).Add new employee");
						System.out.println("9)Go back to main menu");
						choice=sc.nextInt();
						break;
					case 3:
						car[car_counter]=new Cars();
						car[car_counter].setdetails();
						car_counter++;
						System.out.println();
						System.out.println("1).Add new cars");
						System.out.println("9)Go back to main menu");
						choice=sc.nextInt();
						break;
					case 4:
						for(int i=0;i<showroom_counter;i++){
							showroom[i].getdetails();
							System.out.println();

						}
						System.out.println();
						System.out.println("9)go back to main menu");
						System.out.println("0)Exit");
						choice=sc.nextInt();
						break;
					case 5:
						for(int i=0;i<employee_counter;i++){
							employee[i].getdetails();
							System.out.println();
						}
						System.out.println();
						System.out.println("9)go back to main menu");
						System.out.println("0)Exit");
						choice=sc.nextInt();
						break;
					case 6:
						for(int i=0;i<car_counter;i++){
							car[i].getdetails();
							System.out.println();

						}
						System.out.println();
						System.out.println("9)go back to main menu");
						System.out.println("0)Exit");
						choice=sc.nextInt();
						break;
				}
			}
		}
	}
}
