package com.unama;

import java.util.Scanner;

public class Questao_2_aula04 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, media, mediaf;

        System.out.print("Informe a 1° nota do aluno: ");
        n1 = sc.nextDouble();

        System.out.print("Informe a 2° nota do aluno: ");
        n2 = sc.nextDouble();

        System.out.print("Informe a 3° nota do aluno: ");
        n3 = sc.nextDouble();

        media = (n1+n2+n3)/3;

        if(media > 6){
            System.out.println("|  Media aritimética |  Mensagem  | ");
            System.out.println("|    0,0 ---  3,0    |  Reprovado | ");
            System.out.println("|    3,0 ---  7,0    |    exame   | ");
            System.out.println("|    7,0 --- 10,0    |  Aprovado  |");
            System.out.printf("A media do aluno foi de %.2f",media);
            System.out.println("O aluno está aprovado!");
        }
        else{
            System.out.println("|  Media aritimética | Mensagem   | ");
            System.out.println("|    0,0 ---  3,0    |  Reprovado | ");
            System.out.println("|    3,0 ---  7,0    |    exame   | ");
            System.out.println("|    7,0 --- 10,0    |  Aprovado  |");
            System.out.printf("A meida do alunio foi de %.2f",media);
            System.out.println("O aluno está reprovado!");

            mediaf = 6 - media;

            System.out.printf("O aluno precisa de %.2f",mediaf," para passar!");

        }



    }
}
