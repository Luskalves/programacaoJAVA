package com.company;

import java.util.Scanner;

public class Letra_A_aula05 {

    public static void main(String[] args) {

        int aluno;
        double media,nota;
        Scanner sc = new Scanner(System.in);
        media = 0;
        System.out.print("Informe a quantidade de alunos: ");
        aluno = sc.nextInt();

        for(int n = 1; n<=aluno; n++){
            System.out.print("Informe a nota do aluno "+ n +": ");
            nota = sc.nextDouble();
            media = media + nota;
        }
        media = media / aluno;
        System.out.println("A media da turma foi de: "+media);
    }
}
