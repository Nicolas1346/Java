package com.mycompany.syven;
import java.util.Scanner;

public class Syven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("=== MENU ==="); 
            System.out.println("1 - Cadastro");
            System.out.println("2 - Listar");
            System.out.println("3 - Sair");
            
            System.out.println("Voce escolheu: ");
            
            int opcao = sc.nextInt();
            
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
