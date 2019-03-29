
import java.util.Scanner;
class employees{
public static void main (String[] args) {
	String name;
	int amount;
	int value;
	Scanner scan =new Scanner (System.in); 
	System.out.println(" enter your name");
    name= scan.nextLine();
    System.out.println(" ==============================");
	System.out.println("list of type of salary ");
	System.out.println(" ==============================");
	System.out.println("1: mantholy salary ");
	System.out.println("2: hourly salary ");
	System.out.println("3: weekly salary ");
	System.out.println(" ==============================");
    System.out.println(" pleas selct the type of salary");
   	value= scan.nextInt();
	switch(value){
	case 1:
			
	System.out.println("enter your salary");
			int salary= scan.nextInt();
			float compression=(salary*5)/100;
			float deduction=(salary*30)/100;
			float balance=(salary+compression)-deduction;
			System.out.println(" ==============================");
			System.out.println("Name :");
			System.out.print(name);
			System.out.println("\n");
			System.out.println("we have take 30% of your salary as diduction which is:");
			System.out.print(deduction);
			System.out.println("\n");
			System.out.println("we have added 5% of your salary as compression which is:");
			System.out.print(compression);
			System.out.println("\n");
			System.out.println("your new balance is:");
			System.out.print(balance);
			break;
			
			case 2:
			System.out.println("enter number oh hours");
			int hours= scan.nextInt();
			System.out.println("enter the hourly rate");
			int hourly_rate= scan.nextInt();
			float salary1= hourly_rate * hours;
			System.out.println(" ==============================");
			System.out.println("Name :");
			System.out.print(name);
			System.out.println("\n");
			System.out.println("your groth salary is:");
			System.out.print(salary1);
			System.out.println("\n");
			System.out.println("deduction");
			float tax= (salary1*30)/100;
			float rssb= (salary1*3)/100;
			float salary2=salary1-(tax+rssb);
			
			System.out.println("this tax is reducted from your salary:");
			System.out.print(tax);
			System.out.println("\n");
			System.out.println(" RSSB also reducted from your salary:");
			System.out.print(rssb);
		    System.out.println("\n");
			System.out.println("your new balance is:");
			System.out.print(salary2);
			break;
			
			case 3:
			System.out.println("enter the number of week");
			int weeks= scan.nextInt();
			System.out.println("enter the weekly rate");
			int weekly_rate= scan.nextInt();
			float salary3=weeks*weekly_rate;
			System.out.println(" ==============================");
			System.out.println("Name :");
			System.out.print(name);
			System.out.println("\n");
			System.out.println("your salary is:");
		
			System.out.print(salary3);
			break;
			default:
			System.out.println(" ==============================");
			System.out.println("Name :");
			System.out.print(name);
			System.out.println("\n");
			System.out.println(" You have selected incorrect choice!!!!.");
			System.out.println(" Try again later.");
			
	}
	
 }
}