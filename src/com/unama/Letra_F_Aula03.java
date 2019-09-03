package com.unama;

import java.util.Scanner;

public class Letra_F_Aula03 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int faltas;
        double n1, n2, n3, n4, media;

        System.out.print("Informe a 1° nota do aluno: ");
        n1 = sc.nextDouble();
        System.out.print("Informe a 2° nota do aluno: ");
        n2 = sc.nextDouble();
        System.out.print("Informe a 3° nota do aluno: ");
        n3 = sc.nextDouble();
        System.out.print("Informe a 4° nota do aluno: ");
        n4 = sc.nextDouble();

        media = (n1+n2+n3+n4)/4;

        System.out.print("Informe a quantidade de faltas do aluno: ");
        faltas = sc.nextInt();

        if((faltas < 40) && (media > 6.0)){
            System.out.print("Supimpa");
        }
        if((faltas > 40) && (media > 6)){
            System.out.println("O aluno está Reprovado");

        }
        if((faltas < 40) && (media < 6.0)){
            System.out.print("Você está na recuperação");
        }
        if((faltas > 40) && (media < 6.0)){
            System.out.print("Você tá fudido meu parceiroKKKKKKKKKKKKKKK");
        }

    }

}
