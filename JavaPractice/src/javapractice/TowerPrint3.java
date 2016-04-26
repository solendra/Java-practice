/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;


public  class TowerPrint3
{
	 
	  public static void main(String[]args)
	 {
	 	int i;
	 	int j;
	 	for(i=1;i<=5;i++)
	 	{
	 		for(j=1;j<=5;j++)
			{
				if(i==1|| j==1 ||i==5 || j==5|| i==j)
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
}
