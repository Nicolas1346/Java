package com.mycompany.vinte;

import java.util.Scanner;

public class Vinte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("=== CALCULADORA ===");
            System.out.println("1 - SOMAR");
            System.out.println("2 - SUBTRAIR");
            System.out.println("3 - MULTIPLICAR");
            System.out.println("4 - DIVIDIR");
            System.out.println("0 - SAIR");

            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando...");
                break;
            }

            System.out.print("Digite o primeiro numero: ");
            double n1 = sc.nextDouble();

            System.out.print("Digite o segundo numero: ");
            double n2 = sc.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (n1 * n2));
                    break;
                case 4:
                    if (n2 != 0) {
                        System.out.println("Resultado: " + (n1 / n2));
                    } else {
                        System.out.println("Erro: divisao por zero!");
                    }
                    break;
                default:
                   System.out.println("Opçao invalida! ");
            }
        }

        sc.close();
    }
}