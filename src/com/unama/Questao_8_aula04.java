package com.unama;

import java.util.Scanner;

public class Questao_8_aula04 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int esc;
        double n1,n2, soma;
        double num;

        System.out.println("Menu de opções:");
        System.out.println("1. Somar dois numeros.");
        System.out.println("2. Raiz quadrada de um número.");
        System.out.print("Digite a opção desejada: ");
        esc = sc.nextInt();

        if(esc == 1){
            System.out.print("Digite o 1° numero: ");
            n1 = sc.nextDouble();
            System.out.print("Digite o 2° numero: ");
            n2 = sc.nextDouble();
            soma = n1 + n2;
            System.out.println("A soma dos dois numeros é "+ soma);
        }
        if(esc == 2){
            System.out.println("Digite um numero: ");
            num = sc.nextDouble();
            double raiz =  Math.sqrt(num);
            System.out.println("A raiz quadrada do numero é de " + raiz);
        }


    }
}
