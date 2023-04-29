import java.util.Scanner;

public class Switch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the variable:");
		String variable=sc.next();
		
		switch(variable)
		{
		case "apple":
			System.out.println("The fruit is apple");
			break;
		case "mango":
			System.out.println("The fruit is mango");
			break;
		case "grapes":
			System.out.println("The fruit is grapes");
			break;
			default:
				System.out.println("Invalid fruit name.");
		}

	}

}
