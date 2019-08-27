package com.unama;

import java.util.Scanner;

public class LetraB {

    public static void main(String[] args) {

        double numero;
        double resultado;
        Scanner scanner = new Scanner(System.in);

        System.out.print("informe o numero: ");
        numero = scanner.nextDouble();

        resultado = numero * 2;

        System.out.println("O dobro do seu numero é : " + resultado);

    }
}

