import java.util.Scanner;

public class Sumof_even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		 
		//int n;
		int even_sum=0;
		int odd_sum=0;
		int choice;
		do{
			
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
			if(n%2==0)
			{
			  even_sum +=n;
			}
			else
			{
				odd_sum+=n;
			}
			System.out.println("Enter 1 if you want to continue and press 0  if you want to quit.");
		choice=sc.nextInt();
		}while(choice==1);
		System.out.println("The sum of even numbers is:"+even_sum);
		System.out.println("The sum of odd numbers is:"+odd_sum);
		}
	}

