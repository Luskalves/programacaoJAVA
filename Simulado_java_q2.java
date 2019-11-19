package com.company;

import java.util.Scanner;

public class Simulado_java_q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vet[] = new int[5];

        int num= 0,pimba = 100;

        for(int i=0;i<5;i++){
            System.out.println("digite um valor: ");
            vet[i] = sc.nextInt();
            if (vet[i] <= pimba){
               pimba = vet[i];
            }
            if(vet[i] > num){
                num = vet[i];
            }

        }
        System.out.println("O maior numero é: "+num);
        System.out.println("O menor numero é: "+pimba);



    }
}
