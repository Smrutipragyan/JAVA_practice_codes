import java.util.Scanner;

public class Reverse_of_a_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//
//		System.out.println("Enter the number here:");
		int num =27102001;
		 
		while(num>0)
		{
			int res=num%10;
			num=num/10;
			System.out.print(res);
		}
		}
		  
		 

}
