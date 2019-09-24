package com.company;

import java.util.Scanner;

public class Simulado_Letra_A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n1,n2, media;

	    System.out.print("Informe a 1° nota: ");
	    n1 = sc.nextDouble();

        System.out.print("Informe a 2° nota: ");
        n2 = sc.nextDouble();

        media = (n1 + n2) / 2;

        if(media >= 0 & media < 3){
            System.out.println("O aluno está reprovado!");
        }
        if(media >= 3 & media < 7){
            System.out.println("O aluno precisará fazer um exame!");
        }
        if(media >= 7 & media < 10.1){
            System.out.println("O aluno está aprovado!!");
        }

    }
}
