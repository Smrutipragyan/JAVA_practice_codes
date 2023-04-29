import java.util.Scanner;

public class Func_overloading {

	public static int sum(int a,int b) {
		return a+b;
	}
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the value for a and b : ");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		System.out.println(sum(a,b)); 
		System.out.println("Enter the value for a, b, c : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		System.out.println(sum(x,y,z)); 
	}

}
