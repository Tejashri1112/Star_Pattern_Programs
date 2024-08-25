
/*

*        *
**      **
***    ***
****  ****
**********

 */

package Start_Pattern;

public class Class2 {
	public static void main(String[] args) 
	{
		int irange=5;
		int jrange=10;
		myCode(irange,jrange);
	}
	//EndOfMainMethod
	public static void myCode(int irange,int jrange)
	{
		//Write code here
		int end=10;
		int space1=2;
		int space2=9;
		for(int i=1;i<=irange;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(j>=space1 && j<=space2)
				System.out.print(" ");
				else
				System.out.print("*");
			}
			System.out.println();
			space1++;
			space2--;
		}
	}
}
