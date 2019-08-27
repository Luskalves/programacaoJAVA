package com.unama;

import java.util.Scanner;

public class LetraD {

    public static void main(String[] args){

        double raio, perimetro, area;

        Scanner sn = new Scanner(System.in);

        System.out.print("informe o raio do circulo: ");
        raio = sn.nextDouble();

        double quadrado = Math.pow(raio,2);

        area = 3.14 * quadrado;
        perimetro = 2 * 3.14 * raio;
        System.out.printf("O perimetro do circulo é de: %.2f", perimetro);
        System.out.println("\nA area do circulo é de " + area);

    }
}
