import java.util.Scanner;

public class AverageOfNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		double avg=(num1+num2+num3)/3;
		
		System.out.println("The average of 3 numbers :"+avg);

	}

}
