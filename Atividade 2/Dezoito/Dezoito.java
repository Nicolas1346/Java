package com.mycompany.dezoito;

public class Dezoito {

    public static void main(String[] args) {
       int [][] numeros = {
           {1, 2, 3},
           {4, 5, 6},  
           {7, 8, 9}
    
     };
       int soma = 0;
       
       for(int a = 0; a < numeros.length; a++) {
        for(int j= 0; j < numeros[a].length; j++) {
            
          soma += numeros[a][j];
          
          System.out.println("Valor: " + soma );
                  }
        }
    }
}
