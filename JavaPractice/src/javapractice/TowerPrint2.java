/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;


public  class TowerPrint2
{
	 public static void main(String[]args)
	 {
	 	int i;
	 	int j;
	 	for(i=1;i<=4;i++)
	 	{
	 		for(j=1;j<=5;j++)
			{
				if((i==j/2))
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