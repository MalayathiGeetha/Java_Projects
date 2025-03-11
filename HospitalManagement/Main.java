import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,y;
		String u_N,password;
		System.out.println("-----------------------------");
		System.out.println("\t To access hospital system enter login:");
		System.out.println("-----------------------------");
		System.out.println("\tUser name:\t");
		u_N=input.next();
		System.out.println("\tPassword:\t");
		password=input.next();
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		if(u_N.equals("project")&&password.equals("laaa")){
			do{
				System.out.println("------------------------");
				System.out.println("     welcome to HMS     ");
				System.out.println("------------------------");
				System.out.println("1.ADMIN\t2.DEPARTMENT\t3.PHARMACY\n");
				System.out.println("Enter option:");
				a=input.nextInt();
				switch(a){
					case 1:
						Admin rec=new Admin();
						rec.choose();
						break;
					case 2:
						Dep x=new Dep();
						x.Dep_Display();
						break;
					case 3:
						Pharmacy p=new Pharmacy();
						p.display();
						break;
					default:
						System.out.println("enter valid option from (1,2, or 3");
						break;
				}
				System.out.println("To exit system press 1");
				y=input.nextInt();

			}while(y!=1);
		}else{
			System.out.println("*********WRONG!!!!!!USER NAME OR PASSWORD**********");
		}

	}
}