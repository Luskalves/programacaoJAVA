package com.unama;

import java.util.Scanner;

public class LetraF {
    public static void main(String[] args){

        double preco, produtos,total;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de produtos levados: ");
        produtos = sc.nextDouble();

        System.out.print("Informe o preço dos produtos: ");
        preco = sc.nextDouble();

        total = preco * produtos;

        System.out.println("o cliente deve pagar R$" + total);

    }
}
