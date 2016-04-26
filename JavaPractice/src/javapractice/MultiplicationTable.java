/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author solendra
 */
public class MultiplicationTable {
    
    public static void main (String[]args)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("start of table"+i);
            for(int j=1;j<=10;j++)
            {
                System.out.println(i+"X"+j+"="+(i*j));
            }
                System.out.println("End of table "+ i);
                System.out.println(".........................");
        }
    }
    
}
