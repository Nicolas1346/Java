package com.mycompany.oito;

public class Oito {

    public static void main(String[] args) {
       int num [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100,};
       int valor = 20;
       boolean encontrado = false;
       
       for(int n : num) {
           if(n == valor) {
               encontrado = true;
               break;
           } 
       }
       
       if(encontrado) {
           System.out.println("O numero " + valor + " foi encontrado no vetor!");
       }else{
           System.out.println("O numero " + valor + " nao foi encontrado no vetor!");
       }
           
    }
}
