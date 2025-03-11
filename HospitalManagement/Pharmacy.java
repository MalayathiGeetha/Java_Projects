import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;
import java.io.File;
import java.io.IOException;
public class Pharmacy{
	public void display(){
		int c,a,n;
		Scanner input=new Scanner(System.in);
		do{
			System.out.println("******** Pharmacy *********");
			System.out.println("1.Add New Medicine\t2.Search Medicine List\nEnter Option:\t");
			c=input.nextInt();
			Cardiac_med cardiac=new Cardiac_med();
			Neurology_med neuro=new Neurology_med();
			Eye_med e=new Eye_med();
			Dental_med den=new Dental_med();
			search_med h=new search_med();
			switch(c){
			case 1:
				System.out.println("Add medicinal drug In:\n1.Cardiology\n2.Neurology\n3.Eye\n4.Dental");
				a=input.nextInt();
				switch(a){
				case 1:
					cardiac.add();
					break;
				case 2:
					neuro.add();
					break;
				case 3:
					e.add();
					break;
				case 4:
					den.add();
					break;
				}
				break;
			case 2:
				System.out.println("View/Search Medicines of:\n1.Cardiology\n2.Neurology\n3.Eye\n4.Dental");
				a=input.nextInt();
				switch(a){
				case 1:
					h.search_heart();
					break;
				case 2:
					h.search_Brain_Med();
					break;
				case 3:
					h.search_Eye_Med();
					break;
				case 4:
					h.search_Dental_Med();
					break;

				}
				break;
			}System.out.println("To Exit Pharmacy press 0");
			n=input.nextInt();
		}while(n!=0);
	}
}
abstract class ADD_Medicine extends Pharmacy{
	String med_name,exp_date,used_for;
	float cost;
	public abstract void add();
}
class Cardiac_med extends ADD_Medicine{
	public void add(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Medicine name:");
		med_name=input.next();
		System.out.println("Cost:");
		cost=input.nextInt();
		System.out.println("Expiry Date:\t");
		exp_date=input.next();
		System.out.println("Used for curing:");
		used_for=input.next();
		try{
			FileWriter g=new FileWriter("Cardiac_med.txt",true);
			g.write(med_name+"\t"+cost+"\t\t"+exp_date+"\t"+used_for+"\n");
			System.out.println("Written");
			g.close();
		}catch(IOException e){
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}
class Neurology_med extends ADD_Medicine{
	public void add(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Medicine name:");
		med_name=input.next();
		System.out.println("Cost:");
		cost=input.nextInt();
		System.out.println("Expiry Date:\t");
		exp_date=input.next();
		System.out.println("Used for curing:");
		used_for=input.next();
		try{
			FileWriter g=new FileWriter("Brain_Medicines.txt",true);
			g.write(med_name+"\t"+cost+"\t\t"+exp_date+"\t"+used_for+"\n");
			System.out.println("Written");
			g.close();
		}catch(IOException e){
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}
class Eye_med extends ADD_Medicine{
	public void add(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Medicine name:");
		med_name=input.next();
		System.out.println("Cost:");
		cost=input.nextInt();
		System.out.println("Expiry Date:\t");
		exp_date=input.next();
		System.out.println("Used for curing:");
		used_for=input.next();
		try{
			FileWriter g=new FileWriter("Eye_Medicines.txt",true);
			g.write(med_name+"\t"+cost+"\t\t"+exp_date+"\t"+used_for+"\n");
			System.out.println("Written");
			g.close();
		}catch(IOException e){
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}
class Dental_med extends ADD_Medicine{
	public void add(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Medicine name:");
		med_name=input.next();
		System.out.println("Cost:");
		cost=input.nextInt();
		System.out.println("Expiry Date:\t");
		exp_date=input.next();
		System.out.println("Used for curing:");
		used_for=input.next();
		try{
			FileWriter g=new FileWriter("Dental_Medicines.txt",true);
			g.write(med_name+"\t"+cost+"\t\t"+exp_date+"\t"+used_for+"\n");
			System.out.println("Written");
			g.close();
		}catch(IOException e){
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}

class search_med extends Pharmacy{
	ArrayList<String> Med=new ArrayList<String>();
	ArrayList<String> Neuro=new ArrayList<String>();
	ArrayList<String> Eye=new ArrayList<String>();
	ArrayList<String> Dental=new ArrayList<String>();
	public void search(){
		Med.add("Name\t\tCost\t\tExpiry Date\t\tUsed for:\t\n");
		Med.add("Lopring\t500\t\t2/5/2023\tLowering Blood Pressure\n");
		Med.add("Asprin\t400\t\t6/7/2034\tprevent blood clots\n");
		Med.add("Statins\t300\t\t13/8/2034\tLower Cholestrol levels\n");
		try{
			FileWriter g=new FileWriter("Heart_Patients.txt",true);
			g.write(String.valueOf(Med));
			System.out.println("Written");
			g.close();
		}catch(IOException e){
			System.out.println("Error");
			e.printStackTrace();
		}
	}
	public void write_Neuro(){
		Neuro.add("Name\t\tCost\t\tExpiry Date\t\tUsed for:\t\n");
		Neuro.add("Diazepam\t\t500\t\t3/8/2022\t\tAnxiety\n");
		Neuro.add("Atomoxetine\t\t300\t\t6/7/2029\t\tHyperActivity Disorder\n");
		try{
			FileWriter g=new FileWriter("Brain_Medicines.txt",true);
			g.write(String.valueOf(Neuro));
			System.out.println("Written");
			g.close();
		}catch(IOException e){
			System.out.println("Error");
			e.printStackTrace();
		}
	}
	public void write_Dental(){
		Dental.add("Name\t\tCost\t\tExpiry Date\t\tUsed for:\t\n");
		Dental.add("ibrufen\t\t400\t\t2/4/2022\n");
		Dental.add("maproxen\t\t600\t\t6/8/2024\n");
		try{
			FileWriter g=new FileWriter("Dental_Medicines.txt",true);
			g.write(String.valueOf(Dental));
			System.out.println("Written");
			g.close();
		}catch(IOException e){
			System.out.println("Error");
			e.printStackTrace();
		}
	}
	public void search_heart(){
		try{
			File g=new File("Cardiac_med.txt");
			Scanner my=new Scanner(g);
			while(my.hasNextLine()){
				String data=my.nextLine();
				System.out.println(data);
			}
			my.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	public void search_Brain_Med(){
		try{
			File g=new File("Brain_Medicines.txt");
			Scanner my=new Scanner(g);
			while(my.hasNextLine()){
				String data=my.nextLine();
				System.out.println(data);
			}
			my.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	public void search_Eye_Med(){
		try{
			File g=new File("Eye_Medicines.txt");
			Scanner my=new Scanner(g);
			while(my.hasNextLine()){
				String data=my.nextLine();
				System.out.println(data);
			}
			my.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
	public void search_Dental_Med(){
		try{
			File g=new File("Dental_Medicines.txt");
			Scanner my=new Scanner(g);
			while(my.hasNextLine()){
				String data=my.nextLine();
				System.out.println(data);
			}
			my.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}