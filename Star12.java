/*
XOOOO
OXOOO
OOXOO
OOOXO
OOOOX
 */
package Start_Pattern;

public class Star12 {
	public static void main(String[] args) 
	{
		int irange=5;
		int end=5;
		for(int i=1;i<=irange;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(j==i)
				System.out.print("X");
				else
				System.out.print("O");
			}
			System.out.println();
		}
	}
}
