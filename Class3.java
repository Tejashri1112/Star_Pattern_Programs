

/*

* * * * * 
 * * * * 
  * * * 
   * * 
    * 
 */
package Start_Pattern;

public class Class3 {
	public static void main(String[] args) 
	{
		int irange=5;
		int jrange=5;
		myCode(irange,jrange);
	}
	//EndOfMainMethod
	private static void myCode(int irange,int jrange) 
	{
		//WriteCode Here
		int end=5;
		int space=0;
		for(int i=1;i<=irange;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(j<=space)
				System.out.print(" ");
				else
				System.out.print("*"+" ");
			}
			System.out.println();
			space++;
			//end--;
		}
	}
}
