package com.mycompany.dezeseis;

public class Dezeseis {

    public static void main(String[] args) {
      
 int numero = 5;
        int fatorial = 1;

        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println("5! = " + fatorial);
           
    }
}
