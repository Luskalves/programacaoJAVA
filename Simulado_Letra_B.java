package com.company;

import java.util.Scanner;

public class Simulado_Letra_B {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int tipo;
        double rendimento,fundo;

        System.out.println("Unabank");
        System.out.println("[1]      poupança       |  3% ");
        System.out.println("[2] Fundo de renda fixa |  4% ");
        System.out.print("Informe o tipo de transação você gostaria de fazer: ");
        tipo = sc.nextInt();

        System.out.print("Informe o quanto você vai depositar: ");
        fundo = sc.nextDouble();

        if (tipo == 1){
            fundo = fundo+(fundo*0.03);
        }
        if (tipo == 2){
            fundo = fundo+(fundo*0.04);
        }

        System.out.println("Seu novo saldo é de: R$"+fundo);

    }
}
