package com.unama;

import java.util.Scanner;

public class LetraH {
    public static void main(String[] args){

        double salario, reajuste, salarioR;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o seu salário: ");
        salario = sc.nextDouble();


        System.out.print("Digite o valor do reajuste(Um numero entre 0 e 1): ");
        reajuste = sc.nextDouble();

        do {
            System.out.print("ERROR!\n Digite um valor valido:");
            reajuste = sc.nextDouble();
        } while (reajuste > 1);

        salarioR = salario + (salario * reajuste);

        System.out.print

    }
}
