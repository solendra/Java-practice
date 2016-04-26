/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author solendra
 */
public class TowerPrint1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int row=5;row>=1; row--)
        {
            for(int col=1;col<=row;col++)
            {
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
