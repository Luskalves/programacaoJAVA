package com.unama;

import java.util.Scanner;

public class Letra_G_Aula04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int resto;

        System.out.print("Digite um numero: ");
        num = sc.nextInt();

        resto = num % 2;

        if (resto != 0){
            System.out.println("O numero é impar");
        }
        else{
            System.out.println("O numero é par");
        }


    }
}
