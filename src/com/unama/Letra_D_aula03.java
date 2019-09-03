package com.unama;

import java.util.Scanner;

public class Letra_D_aula03 {
    //public static void bool ()
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double l1 ,l2 ,l3;
        boolean Triangulo = false;

        System.out.print("Informe o valor do lado 1: ");
        l1 = sc.nextDouble();

        System.out.print("Informe o valor do lado 2: ");
        l2 = sc.nextDouble();

        System.out.print("Informe o valor do lado 3: ");
        l3 = sc.nextDouble();

        if((l1 + l2 < l3) || (l1 + l3 < l2) || (l2 + l3 < l1)){
            Triangulo = true;
            System.out.println("Não é possivel formar um triangulo");
                    }
        else{if((l1 == l2) && (l2 == l3)){
            System.out.println("O triangulo é equilátero.");
        }

        if(((l1 == l2) && (l2 != l3) || ((l1 == l3) && (l2 != l3)) || ((l2 == l3) && (l2 != l1)))){

            System.out.println("O triângulo é isoceles.");
        }

        if((l1 != l2) && (l2 != l3)){
            System.out.println("O triângulo é escaleno.");
        }}

    }// fim main
}// fim tudo
