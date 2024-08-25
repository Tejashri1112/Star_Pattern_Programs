
/*
*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****

 */


package Start_Pattern;

public class Class10 {
	public static void main(String[] args) 
	{
		int irange=9;
	    int end=5;
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
			if(i<5)
			space++;
			else
			space--;
		}
	}
}
