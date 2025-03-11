import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
public class Patient{
	public ArrayList<String> patients=new ArrayList<String>();
	private String name,relative,Disease;
	private int age,dep;
	private char gender;
	double CNIC;
	public void ADD_Patient(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter name:");
		name=input.next();
		System.out.println("Enter CNIC:");
		CNIC=input.nextDouble();
		System.out.println("Enter patients Relative name:");
		relative=input.next();
		System.out.println("Enter age:");
		age=input.nextInt();
		System.out.println("Gender(F/M):");
		gender=input.next().charAt(0);
		System.out.println("Problem/Disease");
		Disease=input.next();
		System.out.println("Refer to Department\n1.Cardiology\n2.Neurology\n3.Eye\n4.Dental\n5.Lab");
		dep=input.nextInt();
		patients.add("Name:"+name);
		patients.add("Relative`s Name:"+relative);
		patients.add("\nGender:"+gender);
		patients.add("\nDisease:"+Disease);
		switch(dep){
			case 1:
				patients.add("Department:Cardiology");
				try{
					FileWriter g=new FileWriter("Heart_Patients.txt",true);
					g.write(String.valueOf(patients));
					System.out.println("Written");
					g.close();
				}catch(IOException e){
					System.out.println("Error");
					e.printStackTrace();
				}
				break;
			case 2:
				patients.add("Department:Neurology");
				try{
					FileWriter g=new FileWriter("Brain_Patients.txt",true);
					g.write(String.valueOf(patients));
					System.out.println("Written");
					g.close();
				}catch(IOException e){
					System.out.println("Error");
					e.printStackTrace();
				}
				break;
			case 3:
				patients.add("Department:Eye");
				try{
					FileWriter g=new FileWriter("Eye_Patients.txt",true);
					g.write(String.valueOf(patients));
					System.out.println("Written");
					g.close();
				}catch(IOException e){
					System.out.println("Error");
					e.printStackTrace();
				}
				break;
			case 4:
				patients.add("Department:Dental");
				try{
					FileWriter g=new FileWriter("Dental_Patients.txt",true);
					g.write(String.valueOf(patients));
					System.out.println("Written");
					g.close();
				}catch(IOException e){
					System.out.println("Error");
					e.printStackTrace();
				}
				break;
			case 5:
				patients.add("Department:Lab");
				try{
					FileWriter g=new FileWriter("LabPatients.txt",true);
					g.write(String.valueOf(patients));
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

class view_Patients{
	Scanner input=new Scanner(System.in);
	public void ViewPatient(){
		int a;
		System.out.println("View Patients list of:\n1.Cardiology\n2.Neurology\n3.Eye\n4.Dental\n5.Lab");
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
					File myobj=new File("Brain_Patients.txt");
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
					File myobj=new File("Eye_Patients.txt");
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
					File myobj=new File("Dental_Patients.txt");
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
					File myobj=new File("LabPatients.txt");
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