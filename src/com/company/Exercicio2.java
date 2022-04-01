package com.company;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numeroDigitado = scanner.nextDouble();
        Boolean numeroFalsoOuVerdadeiro = numeroDigitado > 0;
        if (numeroFalsoOuVerdadeiro){
            System.out.println("O número digitado é positivo. ");
        }
        else {
            System.out.println("O número digitado é negativo. ");
        }
    }
}
