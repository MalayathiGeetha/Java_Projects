import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public abstract class Doctors{
	public ArrayList<String> Doctor=new ArrayList<String>();
	public abstract void Bio_Data();
}
class ADD_Doctor extends Doctors{
	private String name,Special,workingHours;
	private int age,dep;
	private char gender;
	double CNIC;
	Scanner input=new Scanner(System.in);
	public void Bio_Data(){
		System.out.println("Enter name:");
		name=input.next();
		System.out.println("Enter CINC:");
		CNIC=input.next();
		System.out.println("Enter age:");
		age=input.nextInt();
		System.out.println("Gender(F/M):");
		gender=input.next().charAt(0);
		System.out.println("Working hours:");
		workingHours=input.next();
		Doctor.add("Name:\t"+name);
		Doctor.add("CNIC:\t"+CNIC);
		Doctor.add("Age:\t"+age);
		Doctor.add("Gender:\t"+gender);
		Doctor.add("Working Hours:\t"+workingHours);
		System.out.println("Specialization in :\t");
		special=input.next();
		Doctor.add("Specialization in:\t"+special);
		System.out.println("Hired in department:\t");
		System.out.println("1.Cardiology\n2.Neurology\n3.Eye\n4.Dental\n5.Lab");
		dep=input.nextInt();
		switch(dep){
			case 1:
				Doctor.add("Department:Cardialogy");
				try{
					FileWriter g=new FileWriter("Heart_Specialist.txt",true);
					g.write(String.valueOf(Doctor));
					System.out.println("Written");
					g.close();
				}catch(IOException e){
					System.out.println("Error");
					e.printStackTrace();
				}
				break;
			case 2:
				Doctor.add("Department:Neurology");
				try{
					FileWriter g=new FileWriter("Neurologist.txt",true);
					g.write(String.valueOf(Doctor));
					System.out.println("Written");
					g.close();
				}catch(IOException e){
					System.out.println("Error");
					e.printStackTrace();
				}
				break;
			case 3:
				Doctor.add("Department:Eye");
				try{
					FileWriter g=new FileWriter("Eye_specialist.txt",true);
					g.write(String.valueOf(Doctor));
					System.out.println("Written");
					g.close();
				}catch(IOException e){
					System.out.println("Error");
					e.printStackTrace();
				}
				break;
			case 4:
				Doctor.add("Department:Dental");
				try{
					FileWriter g=new FileWriter("Dentist.txt",true);
					g.write(String.valueOf(Doctor));
					System.out.println("Written");
					g.close();
				}catch(IOException e){
					System.out.println("Error");
					e.printStackTrace();
				}
				break;
			case 5:
				Doctor.add("Department:Lab");
				try{
					FileWriter g=new FileWriter("Lab_Doctors.txt",true);
					g.write(String.valueOf(Doctor));
					System.out.println("Written");
					g.close();
				}catch(IOException e){
					System.out.println("Error");
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("enter valid option from(1,2,3,4,5,6)");
				break;
		}
	}
}

class view_Doctor{
	Scanner input=new Scanner(System.in);
	public void display(){
		int a;
		System.out.println("View Doctor list of:\n1.Cardiology\n2.Neurology\n3.Eye\n4.Dental\n5.Lab");
		a=input.nextInt();
		switch(a){
			case 1:
				try{
					File myobj=new File("Heart_Specialist.txt");
					Scanner myReader=new Scanner(myobj);
					while(myReader.hasNextLine()){
						String data=myReader.nextLine();
						System.out.println(data);
					}
					myReader.close();

				}catch(FileNotFoundException e){
					e.printStackTrace();
				}
				break;
			case 2:
				try{
					File myobj=new File("Neurologist.txt");
					Scanner myReader=new Scanner(myobj);
					while(myReader.hasNextLine()){
						String data=myReader.nextLine();
						System.out.println(data);
					}
					myReader.close();

				}catch(FileNotFoundException e){
					e.printStackTrace();
				}
				break;
			case 3:
				try{
					File myobj=new File("Eye_specialist.txt");
					Scanner myReader=new Scanner(myobj);
					while(myReader.hasNextLine()){
						String data=myReader.nextLine();
						System.out.println(data);
					}
					myReader.close();

				}catch(FileNotFoundException e){
					e.printStackTrace();
				}
				break;
			case 4:
				try{
					File myobj=new File("Dentist.txt");
					Scanner myReader=new Scanner(myobj);
					while(myReader.hasNextLine()){
						String data=myReader.nextLine();
						System.out.println(data);
					}
					myReader.close();

				}catch(FileNotFoundException e){
					e.printStackTrace();
				}
				break;
			case 5:
				try{
					File myobj=new File("Lab_Doctors.txt");
					Scanner myReader=new Scanner(myobj);
					while(myReader.hasNextLine()){
						String data=myReader.nextLine();
						System.out.println(data);
					}
					myReader.close();

				}catch(FileNotFoundException e){
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("enter valid option from(1,2,3,4,5)");
				break;
		}
	}
}

