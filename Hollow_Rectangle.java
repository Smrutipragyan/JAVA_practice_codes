
public class Hollow_Rectangle {
public static void Hollow_Rectangle(int row,int cols)
{
	//outer loop-rows
	for(int i=1;i<=row;i++)
	{
		//inner loop-columns
		for(int j=1;j<=cols;j++)
		{
			if(i==1 || i==row || j==1 || j==cols)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hollow_Rectangle(4,6);
		
	}

}
