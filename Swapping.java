import java.util.Scanner;

public class Swapping {

	
	public static void swap_num(int a,int b) {
		int c=a;
		    a=b;
		    b=c;
		   System.out.println("The value after swapping is: a= "+a+ " and b=  "+b);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a and b-");
		int a=sc.nextInt();
		int b=sc.nextInt();
		 
		swap_num(a,b);
		 
	}
}
