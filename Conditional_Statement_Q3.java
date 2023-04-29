import java.util.Scanner;

public class Conditional_Statement_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day here:");
		String day=sc.next();
		
		switch(day) {
		case "Monday":System.out.println("Today is Monday.");break;
		case "Tuesday":System.out.println("Today is tuesday.");break;
		case "Wednersday":System.out.println("Today is Wednersday.");break;
		case "Thursday":System.out.println("Today is Thursday.");break;
		case "Friday":System.out.println("Today is Monday.");break;
		case "Saturday":System.out.println("Today is Saturday.");break;
		case "Sunday":System.out.println("Today is Sunday.");
		 default:
			 System.out.println("Default day entered.");
		}
	}

}
