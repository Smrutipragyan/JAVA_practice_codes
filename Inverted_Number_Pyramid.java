
public class Inverted_Number_Pyramid {

	public static void  Inverted_Number_Pyramid(int n){
		//outer loop
		for(int i=1;i<=n;i++)
		{
			//inner loop
			for(int j=1;j<=n-i+1;j++)
			{
				// for printing numbers
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inverted_Number_Pyramid(5);
		
	}

}
