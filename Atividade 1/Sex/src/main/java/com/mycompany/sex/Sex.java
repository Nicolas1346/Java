package com.mycompany.sex;
import java.util.Scanner;

public class Sex {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Qual sua idade? ");
        int idade = sc.nextInt();
        sc.nextLine();
        
        if(idade < 12) {
            System.out.print("Voce e uma crianca");
        }else if (idade < 18) {
            System.out.print("Voce e um adolecente");
        } else {
            System.out.print("Voce e maior de idade");
        }
    
    
    
    
    
    
    
    
    }
}
