/*

oo*oo
oo*oo
*****
oo*oo
oo*oo

 */

package Start_Pattern;

public class Star10 {
	public static void main(String[] args) 
	{
		int irange=5;
		int end=5;
		for(int i=1;i<=irange;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(i==3 || j==3)
				System.out.print("*");
				else
				System.out.print("o");
			}
			System.out.println();
		}
	}
}
