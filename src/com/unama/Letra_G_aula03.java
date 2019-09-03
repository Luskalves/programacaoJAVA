package com.unama;

import java.util.Scanner;

public class Letra_G_aula03 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double n1,n2;

        System.out.print("Digite o primeiro valor: ");
        n1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        n2 = sc.nextDouble();

        if(n1 > n2){
            System.out.println("1°: "+ n1);
            System.out.println("2°: "+ n2);
        }
        else{
            System.out.println("1°: "+ n2);
            System.out.println("2°: "+ n1);
        }

    }
}
