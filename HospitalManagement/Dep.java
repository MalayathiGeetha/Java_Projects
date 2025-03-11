import java.util.*;

class Dep{
	Scanner input=new Scanner(System.in);
	public void Dep_Display(){
		int a,i;
		Department dep;
		do{
			System.out.println("Departments in our hospital are:1.Cardiology\n2.Neurology\n3.Eye\n4.Dental\n5.ICU/CCU\n6.Lab");
			System.out.println("See Details Or:");
			a=input.nextInt();
			switch(a){
				case 1:
					dep=new Cardiology_Dep();
					dep.dep_Info();
					dep.Services_available();
					break; 
				case 2:
					dep=new Neurology_Dep();
					dep.dep_Info();
					dep.Services_available();
					break;
				case 3:
					dep=new Eye_Dep();
					dep.dep_Info();
					dep.Services_available();
					break;
				case 4:
					dep=new Dentistry_Dep();
					dep.dep_Info();
					dep.Services_available();
					break;
				case 5:
					dep=new ICU_Dep();
					dep.dep_Info();
					dep.Services_available();
					break;
				case 6:
					dep=new Lab();
					dep.dep_Info();
					dep.Services_available();
					break;
				default:
					System.out.println("enter valid option from(1,2,3,4,5,6)");
					break;
			}
			System.out.println("To see department info again press 1");
			i=input.nextInt();

		}while(i==1);
	}
}

abstract class Department{
	abstract void dep_Info();
	abstract void Services_available();
}
class Cardiology_Dep extends Department{
	public void dep_Info(){
		System.out.println("It deals with the treatment of Disorders of heart and blood vessels");
		System.out.println("This field includes medical diagonosis,treatment of congetial heart defects ,heart failure,valvular heart disease");

	}
	public void Services_available(){
		System.out.println("Services available are:\n1.Angiography\n2.Heart surgery\n3.CT of heart\n4.ECG test\n5.BP checkup");
	}
}

class Neurology_Dep extends Department{
	public void dep_Info(){
		System.out.println("Deals with the study and treatment of disorders of the nervous system");
		System.out.println("Diagnosis and treatment of all categories of disease involving central and pheripheral nervous system");
	}
	public void Services_available(){
		System.out.println("Facilities available are:\n1.Computed Axial Tonography scans \n2.Magnetic source imaging\n3.Ultrasound of major blood vessels of head and neck");
	}
}
class Dentistry_Dep extends Department{
	public void dep_Info(){
		System.out.println("Deals with the diagonosis,disorders,prevention and treatment of diseases of oral cavity");
	}
	public void Services_available(){
		System.out.println("Treatments available are:\n1.Braces\n2.Tooth implant\n3.Bridge of teeth\n4.Tooth extraction\n5.Filling\n6.Scaling and root planting");
	}
}
class Eye_Dep extends Department{
	public void dep_Info(){
		System.out.println("Ophthamology deals with diagnosis and treatment of eye disorders");
	}
	public void Services_available(){
		System.out.println("Tests for eye available:\n1.Eye examination\n2.OCT scans\n3.Eyesight check\n4.Ultrasonography of major blood vessels of head and neck");
	}
}
class ICU_Dep extends Department{
	public void dep_Info(){
		System.out.println("Special department in hospital that provide intensive care medicines");
		System.out.println("Patients with life threatening illness or injuries who require constant care and supervision and life support equipment");
	}
	public void Services_available(){
		System.out.println("ICU or CCU include vey critical operations i-e:\nVentilator(lung support)\nhemodylasis(Renal support)\nIntra-Aortic(cardiac support)");
	}
}
class OR extends Department{
	public void dep_Info(){
		System.out.println("Here Surgical Operations are carried out");   
	}
	public void Services_available(){
		System.out.println("1.Eye surgery\t 2.Heart Surgery etc");  
	}
}
class Lab extends Department{
	public void dep_Info(){
		System.out.println("Tests are carried out to obtain info about the patient`s health to aid in diagnosis,treatment or prevention of surgery");
	}
	public void Services_available(){
		System.out.println("Facilities of lab:\n1.Blood Testing(Complete Blood Pressure)\n2.Cholestrol level testing\n3.Liver fat testing\n4.Examination of blood sugar etc");
	}
}