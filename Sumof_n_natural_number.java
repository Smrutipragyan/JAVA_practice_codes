import java.util.*;
public class Sumof_n_natural_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number here:");
//		int num=sc.nextInt();
		int num=1;
		int sum=0;
		
		while(num <= 5)
		{
			sum=sum+num;
			num++;
		}
		
		System.out.println(sum);
		
	}

}
