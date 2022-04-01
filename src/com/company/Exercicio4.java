package com.company;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letraDigitadaPeloUsuario = scanner.nextLine();
        boolean vogal = letraDigitadaPeloUsuario.equals("A,E,I,O,U,a,e,i,o,u");
        if (vogal) {
            System.out.println("A letra digitada é uma vogal. ");
        } else {
            System.out.println("A letra digitada é uma consoante. "); }
    }

}
