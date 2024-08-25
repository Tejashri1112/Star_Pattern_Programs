
/*
  *  
  *  
*****
  *  
  *  
  
 */




package Start_Pattern;

public class Class6 {
	public static void main(String[] args) 
	{
		int irange=5;
		int jrange=5;
		myCode(irange,jrange);
	}
	//EndOfMainMethod
	public static void myCode(int irange,int jrange)
	{
		//Write code here
		int end=5;
		for(int i=1;i<=irange;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(i==3 || j==3)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
