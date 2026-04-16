package com.mycompany.cinco;

public class Cinco {
    
    public static void main(String[] args) {
        
        double[] vetor = {10.0, 5.5, 8.0, 7.5, 9.0};
        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = soma / vetor.length; 

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
