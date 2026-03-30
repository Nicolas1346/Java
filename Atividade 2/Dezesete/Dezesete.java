package com.mycompany.dezesete;

public class Dezesete {

    public static void main(String[] args) {
        int [][] numeros = {
                {1, 2},
                {3, 4}
         };  
        
            for(int a = 0; a < numeros.length; a++) {
                for(int j = 0; j < numeros[a].length; j++) {
                    System.out.println("Valor: " + numeros[a][j] );
                    
           }
        }
    }
}
