package com.unama;

import java.util.Scanner;

public class LetraC {

    public static void main (String[] args){

        double base, altura, area;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a base do triângulo: ");
        base = sc.nextDouble();

        System.out.print("informe a altura do triangulo: ");
        altura = sc.nextDouble();

        area = (base * altura) / 2;

        System.out.println("A área do triângulo é : " + area + "m²");

    }

}
