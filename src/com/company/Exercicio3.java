package com.company;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a letra correspondente ao seu sexo, M para masculino e F para feminino: ");
        String sexo = scanner.nextLine();
        boolean sexoEMasculino = sexo.equals("M");
        if (sexoEMasculino) {
            System.out.println("Seu sexo é masculino. ");
        } else {
            System.out.println("seu sexo é feminino. ");
        }
    }
}