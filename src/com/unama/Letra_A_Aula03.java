package com.unama;

import java.util.Scanner;

public class Letra_A_Aula03 {

    public static void main(String[] args){

        int folhas;
        double preco, total;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de folhas que deseja copiar: ");
        folhas = sc.nextInt();

        if(folhas > 100){

            preco = 0.2;
            total = folhas * preco;

        }
        else{
            preco = 0.25;
            total = folhas * preco;
        }

        System.out.printf("O preço das copias é de R$ %.2f", total);
    }
}
