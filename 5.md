/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cinco;
import java.util.Scanner;

public class Cinco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int a = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Digite outro numero: ");
        int b = sc.nextInt();
        sc.nextLine();
        
            if(a <b){
                System.out.print(a + ( " E menor que " + b)); 
    } else {
                System.out.print(a + (" E maior que " + b));
            }
        
                
      
        
  }     
}
