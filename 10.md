package com.mycompany.dez;
import java.util.Scanner;   

public class Dez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int opcao = 0;
            while(opcao !=3) {
          System.out.println("=== MENU ==="); 
          System.out.println("1 - Ola");
          System.out.println("2 - Bem-Vindo");
          System.out.println("0 - Sair");
          
          System.out.println("Escolha uma opcao");
          
          
          opcao = sc.nextInt();
          
                  switch (opcao) {
            case 1:
                System.out.println("Voce escolheou Cadastro");
                break;
                
            case 2:
                System.out.println("Voce escolheu Listar");
                break;
             
            case 3:
                System.out.println("Voce escolheu Sair");
                break;
                
            default:
                System.out.println("Opicao Invalida");
            }
        } 
    }
}
