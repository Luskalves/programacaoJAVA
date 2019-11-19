package com.company;

import java.util.Scanner;

public class simulado_java_q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[5][5];

        int linhas = 5, colunas = 5;

        for(int l=0;l<linhas;l++){
            for(int c=0;c<colunas;c++){
                System.out.println("Informe um numero: ");
                matriz[l][c] = sc.nextInt();
            }
        }
        for(int i = 0,a = 4;i<5;i++) {
            System.out.println(matriz[i][i]+" "+matriz[i][a]);
            a--;
        }


    }
}
