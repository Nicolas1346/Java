package com.mycompany.dezenoive;
import java.util.Scanner;

public class Dezenoive {

 public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);

        int total = 0;
        int numero;

        System.out.print("Digite um numero (0 para parar): ");
        numero = sc.nextInt();

        while (numero != 0) {
            total += numero;

            System.out.print("Digite outro numero (0 para parar): ");
                numero = sc.nextInt();
        }

        System.out.println("Total acumulado: " + total);

        sc.close();
    }
}

