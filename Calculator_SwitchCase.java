import java.util.Scanner;

public class Calculator_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number-");
		int a=sc.nextInt();
		System.out.println("Enter the second number-");
		int b=sc.nextInt();
		System.out.println("Enter the operator-");
		char operators=sc.next().charAt(0);
		
		switch(operators) {
		case '+':System.out.println("The addition of two numbers:"+ (a+b));
		break;
		case '-':System.out.println("The subtraction of two numbers:"+ (a-b));
		break;
		case '/':System.out.println(("The division of two numbers:")+(a/b));
		break;
		case '*':System.out.println(("The division of two numbers:")+(a*b));
		break;
		case '%':System.out.println (("The division of two numbers:")+(a%b));
		break;
		
			
		}

	}

}
