package com.company;

import java.util.Scanner;

public class Letra_B_aula05 {
    public static void main(String[] args){
        int pacientes,idade,velho;
        velho =0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de pacientes: ");
        pacientes = sc.nextInt();

        for(int n=1;n <= pacientes;n++){
            System.out.print("Informe a idade do paciente "+ n +": ");
            idade = sc.nextInt();
            if(idade > velho){
                velho = idade;
            }
        }
        System.out.print("O paciente mais velho tem "+ velho +" anos");

    }
}
