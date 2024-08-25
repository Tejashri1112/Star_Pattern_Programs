/*
*********
 *******
  *****
   ***
    *
 */
package Start_Pattern;

public class Star13 {
	public static void main(String[] args) 
	{
		int irange=5;
		int end=9;
		int space=0;
		for(int i=1;i<=irange;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(j<=space)
				System.out.print(" ");
				else
				System.out.print("*");
			}
			System.out.println();
			end--;
			space++;
		}
	}
}
