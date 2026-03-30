package com.mycompany.dezeseis;

public class Dezeseis {

    public static void main(String[] args) {
      String n = ("Albertos");
      int contador = 0;
      
        for(int a = 0; a < n.length(); a++) {
            char letra = Character.toLowerCase(n.charAt(a));
            
               if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
               System.out.println("Quantidade de vogais: " + contador);
        
            
        }   
    }
}
