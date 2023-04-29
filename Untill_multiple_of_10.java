import java.util.Scanner;

public class Untill_multiple_of_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		 
		 
		do{
			System.out.println("enter the numer-");
			int num=sc.nextInt();
			 
			if(num%10==0)
			{
				break;
			}
			//System.out.println(num);
			 
				 
		}while(true);
		System.out.println("Found multiple of 10.");
	}

}
