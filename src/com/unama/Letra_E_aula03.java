package com.unama;

import java.util.Scanner;

public class Letra_E_aula03 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double n1, n2, n3;

        System.out.print("Digite o valor do 1° numero: ");
        n1 = sc.nextDouble();
        System.out.print("Digite o valor do 2° numero: ");
        n2 = sc.nextDouble();
        System.out.print("Digite o valor do 3° numero: ");
        n3 = sc.nextDouble();

        if((n1 < n2) && (n2 < n3)){
            System.out.println("n1: " + n1);
            System.out.println("n2: " + n2);
            System.out.println("n3: " + n3);
        }
        else if((n1 < n3) && (n3 < n2)){
            System.out.println("n1: " + n1);
            System.out.println("n3: " + n3);
            System.out.println("n2: " + n2);
        }
        else if((n2 < n1) && (n1 < n3)){
            System.out.println("n2: " + n2);
            System.out.println("n1: " + n1);
            System.out.println("n3: " + n3);
        }
        if((n2 < n3) && (n3 < n1)){
            System.out.println("n2: " + n2);
            System.out.println("n3: " + n3);
            System.out.println("n1: " + n1);
        }
        else if((n3 < n2) && (n2 < n1)){
            System.out.println("n3: " + n3);
            System.out.println("n2: " + n2);
            System.out.println("n1: " + n1);
        }
        else if((n3 < n1) && (n1 < n2)){
            System.out.println("n3: " + n3);
            System.out.println("n1: " + n1);
            System.out.println("n2: " + n2);
        }


    }

}
