package com.unama;

import java.util.Scanner;

public class LetraE {

    public static void main (String[] args){

        double vendasT, comissao;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o total de vendas: ");
        vendasT = sc.nextDouble();

        comissao = vendasT * 0.1;

        System.out.println("A sua comissão é de: " + comissao);

    }

}
