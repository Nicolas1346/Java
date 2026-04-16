package com.mycompany.quartoze;

public class Quartoze {

    public static void main(String[] args) {
        String frase1 = "Gosto de jogar";
        String frase2 = "Gosto de jogar";
        
        boolean encontrada = frase1.contains(frase2);
        
            if(encontrada){
                System.out.println("As frases sao identicas");
            }else{
                System.out.println("As frases sao diferentes");
            } 
    }
}
