package sample;

import java.util.Scanner;

public class exercicio_5_letra_A {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] notas = new int[10];

        for(int x =0;x < notas.length;x++){
            System.out.print("Informe o valor da nota do aluno: ");
            notas[x] = sc.nextInt();
        }
        for(int numero : notas){
            System.out.println(numero);
        }
    }
}
