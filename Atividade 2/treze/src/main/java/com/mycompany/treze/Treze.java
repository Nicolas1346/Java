package com.mycompany.treze;

public class Treze {

    public static void main(String[] args) {
        
    String frase = "Hoje a gente vai sair";
    String palavra = "sair";

    boolean encontrado = frase.contains(palavra);

        if (encontrado) {
            System.out.println("Essa palavra esta na frase");
        }else{
            System.out.println("Esta palavra nao existe na frase");
        }
    
   }
             
}
       
