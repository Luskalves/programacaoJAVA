package com.unama;

import java.util.Scanner;

public class LetraG {
    public static void main(String[] args){

        double largura, comprimento;
        double area;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a largura da sala: ");
        largura = sc.nextDouble();

        System.out.print("Informe o comprimento da sala: ");
        comprimento = sc.nextDouble();

        area = comprimento * largura;
        System.out.println("a area da sala é de "+ area + "m²");
    }
}
