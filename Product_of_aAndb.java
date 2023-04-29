import java.util.Scanner;

public class Product_of_aAndb {
	
	public static int Product(int a,int b)
	{
		int product=a*b;
		System.out.println("Product of a & b is = "+product);
		return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the value of a = ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b = ");
		int b=sc.nextInt();
		
		Product(a,b);
		
	}

}
