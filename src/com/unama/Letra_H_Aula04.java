package com.unama;

import java.util.Scanner;

public class Letra_H_Aula04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sex;
        double alt,peso;

        System.out.println("Informe o seu sexo digitando 1 para M e 2 para F: ");
        sex = sc.nextInt();

        System.out.println("Informe a sua altura: ");
        alt = sc.nextDouble();

        if(sex == 1){
            peso = 72.7 * alt - 58;
            System.out.printf("O seu peso ideal é de %.2f", peso);

        }
        else{
            peso = 62.1 * alt - 44.7;
            System.out.printf("O seu peso ideal é de %.2f", peso);
        }

    }
}
