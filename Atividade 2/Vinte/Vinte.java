package com.mycompany.vinte;

public class Vinte {

    public static void main(String[] args) {
        int[][] numeros = {
          
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}    
            
        };
        
        int contador = 0;
        
        for(int a = 0; a < 3; a++) {
            for(int j = 0; j <3; j++){
                if(numeros[a][j] % 2 == 0) {
                    contador++;
                 
                System.out.println("Pares: " + numeros[a][j]);
             }   
          }          
        }
            
    }
}
