import java.util.Scanner;

public class Ternary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		
		String res=(num>=33)?"Pass":"Fail";
		
		System.out.println(res);
	}

}
