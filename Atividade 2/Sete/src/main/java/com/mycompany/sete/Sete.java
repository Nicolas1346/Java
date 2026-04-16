package com.mycompany.sete;

public class Sete {

    public static void main(String[] args) {
       String[] nomes = new String [5];
       
       nomes[0] = "Marcos";
       nomes[1] = "Paulo";
       nomes[2] = "louis";
       nomes[3] = "Isaque";
       nomes[4] = "Kaua";
       
       for(int a = 0; a < nomes.length; a++) {
           System.out.println("Posicao" + a + ": " + nomes[a]);
       }
    }
}
