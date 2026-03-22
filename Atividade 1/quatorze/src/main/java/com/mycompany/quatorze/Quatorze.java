package com.mycompany.quatorze;
import java.util.Scanner;

public class Quatorze {

    public static void main(String[] args) {
       Scanner Notas = new Scanner (System.in);
       
       double nota1;
       double nota2;
       double nota3;
       double nota4;
       double nota5;
       double media;
       
       System.out.print("Digite a primeira nota: ");
       nota1 = Notas.nextDouble();
       
       System.out.print("Digite a segunda nota: ");
       nota2 = Notas.nextDouble();
       
       System.out.print("Digite a terceira nota: ");
       nota3 = Notas.nextDouble();
       
       System.out.print("Digite a quanta nota: ");
       nota4 = Notas.nextDouble();
       
       System.out.print("Digite a quinta nota: ");
       nota5 = Notas.nextDouble();
       
       media = (nota1 + nota2 + nota3 + nota4 + nota5);
       
       System.out.println("Meida " + media);
        
       if(media >= 70) {
           System.out.println("Parabens!!! Voce foi aprovado");   
       } else if (media >=50) {
           System.out.print("Voce ficou de recuparacao");
       }else{
          System.out.print("Voce foi reprovado");
       }
    }
}
