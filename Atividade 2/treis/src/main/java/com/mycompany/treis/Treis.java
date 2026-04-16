package com.mycompany.treis;


public class Treis {

    public static void main(String[] args) {
        
        int[] vetor = {1 , 5, 6, 8, 4, 3, 7, 2};
        int maior = vetor[0];
        
        for(int valor : vetor) {
            
            if(valor > maior) {
                maior = valor;
            }
        }
                System.out.println("Maior valor: " + maior);
        
    }
}
