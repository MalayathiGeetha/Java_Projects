import java.util.Scanner;
class Admin{
	private int c;
	private char i;
	public void choose(){
		Scanner input=new Scanner(System.in);
		do{
			System.out.println("-------------------------");
			System.out.println("1.Add new Patient\n 2.View Patient List\n 3.Add new Doctors\n 4.View Doctors List");
			System.out.println("-------------------------");
			System.out.println("Enter from 1,2,3 or 4");
			c=input.nextInt();
			Patient p=new Patient();
			
			view_Patients x=new view_Patients();
			switch(c){
				case 1:
					p.ADD_Patient();
					break;
				case 2:
					x.ViewPatient();
					break;
				
				default:
					System.out.println("Enter from 1,2,3 or 4");
					break;
			}
			System.out.println("Do u want to run it again?(Y/N)");
			i=input.next().charAt(0);
		}while(i=='Y'||i=='y');
	}
}