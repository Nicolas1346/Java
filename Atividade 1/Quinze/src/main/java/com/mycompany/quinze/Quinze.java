package com.mycompany.quinze;
import java.util.Scanner;
        
public class Quinze {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int opcao= 0;
        while(opcao != 4) {
            
      System.out.println("=== MENU ==="); 
      System.out.println("1 - Mostrar numeros de 1 a 10");
      System.out.println("2 - Mostrar pares de 1 a 20");
      System.out.println("3 - Mostrar tabuada do 3");
      System.out.println("4 - Sair");
      
      System.out.println("Esoclhe uma das opcoes: ");
      
      opcao = sc.nextInt();
       
            switch (opcao) {
                
                 case 1:
            for(int i = 2; i <= 10; i++)
                    System.out.println(i);
            break;
            
        case 2:
            for(int i= 4; i <=20; i +=2)
                System.out.println(i);
             
            break;
         
        case 3:
           for(int i =2; i <=10; i++)
               System.out.println(3*i);
            break;
            
        case 4:
            System.out.println("Voce escolheu: Sair");
            break;
            
        default:
            System.out.println("Opicao Invalida");
                
            }
        }
    }
}
