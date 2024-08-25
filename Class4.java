
/*

*
**
***
****
*****
****
***
**
*

 */



package Start_Pattern;

public class Class4 {
	public static void main(String[] args) 
	{
		int irange=9;
		int jrange=5;
		myCode(irange,jrange);
	}
	//EndOfMainMethod
	private static void myCode(int irange,int jrange) 
	{
		//WriteCode Here
		int end=1;
		for(int i=1;i<=irange;i++)
		{
			for(int j=1;j<=end;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
			end++;
			else
			end--;
		}
	}
}
