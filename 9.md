package com.mycompany.nona;
import java.util.Scanner;
public class Nona {

    public static void main(String[] args) {
        Scanner Notas = new Scanner(System.in);
        
        double nota1;
        double nota2;
        double media;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = Notas.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = Notas.nextDouble();
        
        media = (nota1 + nota2);
        
        System.out.println("Meida: " + media);
        
        if(media >= 70) {
            System.out.println("Aprovado");
        } else if (media >= 50) {
            System.out.println("Recuperacao");
        }else{    
            System.out.println("Reprovado");
        }
    }
}
