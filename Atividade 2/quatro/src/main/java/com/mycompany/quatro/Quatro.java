package com.mycompany.quatro;

public class Quatro {

    public static void main(String[] args) {
        
        int[] vetor = {1, 6, 4, 9, 2, 8, 7, 3};
        int menor = vetor[0];
        
        for(int valor : vetor) {
            if(valor < menor){
                menor = valor;
                
            }
        }
        System.out.print("Menor numero: " + menor);
    }
}
