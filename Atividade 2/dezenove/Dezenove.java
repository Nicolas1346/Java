package com.mycompany.dezenove;

public class Dezenove {

    public static void main(String[] args) {
       int [][] numeros = {
           {1, 2, 3},
           {4, 5, 6},
           {5, 6, 9}
               
    };
       
        System.out.println("Numeros Diagonal");
       
       for(int a = 0; a < numeros.length; a++) {
           System.out.println(numeros[a][a]);
       }
       
       
    }
}
