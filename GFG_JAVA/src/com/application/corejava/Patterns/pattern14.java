package com.application.corejava.Patterns;
/*
                            *  
                          * * *  
                        * * * * *  
                      * * * * * * *  
                    * * * * * * * * *  
                  * * * * * * * * * * *  
                * * * * * * * * * * * * * 
*/

import java.util.Scanner;

/**
 *
 * @author Vidhikara
 */
public class pattern14 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the no.of stars: ");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int k=1;k<(i*2);k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        input.close();
    }
    
}
