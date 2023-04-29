import java.util.Scanner;

public class Income_Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary:");
		int salary=sc.nextInt();
		
		int tax;
		
		if(salary<50000)
		{
			tax=  0;
		}
		else if(salary>=50000 && salary<=100000)
		{
			tax=(int)(salary*0.2);
		}
		else
		{
			tax=(int)(salary*0.8);
		}
		
		System.out.println("Your tax is :"+tax);
	}

}
