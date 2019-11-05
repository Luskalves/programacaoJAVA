package com.company;

import java.util.Scanner;

public class exercicio07_03 {

    public static String Impapa (float impapa){

        float hue;
        hue = impapa % 2;

        if (hue == 0){
            return "o numero é par";
        }else{
            return "o numero é impar";
        }

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Inforeme um valor qualquer: ");
        num = sc.nextInt();

        String resultado = Impapa(num);

        System.out.println("O numero "+ num +" é "+resultado);

    }

}
