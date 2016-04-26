/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice;

import java.util.Scanner;



/**
 *
 * @author solendra
 */
public class CheckBarEntry {
    
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter age");
        int age=input.nextInt();
        
        System.out.println("Enter [Y/N] for pass");
        boolean pass=input.nextBoolean();
        
         
       
        if(age>=18)
        {
            System.out.println("You are allowed to enter ");
            
            if(pass==true)
            {
             System.out.println("You can enjoy private facility");
            }
        }
        else
            System.out.println("You are under age");
                   
        
          
       
        }
    }
    

