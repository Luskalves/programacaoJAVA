package com.unama;

import java.util.Scanner;

public class Letra_C_Aula04 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.print("Informe quantos anos o narrador tem: ");
        idade = sc.nextInt();

        if(idade <= 10){
            System.out.println("O narrador esta na catogoria: Infantil!");
        }
        if((idade <= 17) && (idade > 10)){
            System.out.println("O narrador está na categoria: Juvenil!");
        }
        if(idade > 17){
            System.out.println("O narrador está na categoria: Senior!");
        }

    }
}
