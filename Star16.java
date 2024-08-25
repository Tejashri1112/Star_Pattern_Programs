/*
*****
****
***
**
*
 */
package Start_Pattern;

public class Star16 {
	public static void main(String[] args) 
	{
		int irange=5;
		int end=5;
		for(int i=1;i<=irange;i++)
		{
			for(int j=1;j<=end;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			end--;
		}
	}
}
