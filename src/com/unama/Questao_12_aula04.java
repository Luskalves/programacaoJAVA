package com.unama;

import java.util.Scanner;

public class Questao_12_aula04 {
    public static void main(String[] args){

        int cargo;
        double salario, aumento;
        Scanner sc = new Scanner(System.in);

        System.out.println("| Codigo | cargo         |  percentual     |");
        System.out.println("|   1    | Escriturario  |     50%         |");
        System.out.println("|   2    | Secretário    |     35%         |");
        System.out.println("|   3    | Caixa         |     20%         |");
        System.out.println("|   4    | Gerente       |     10%         |");
        System.out.println("|   5    | Diretor       | Não tem aumento |\n");

        System.out.print("Informe o codigo do seu cargo: ");
        cargo = sc.nextInt();

        System.out.print("Informe o seu salário: ");
        salario = sc.nextDouble();

        if(cargo == 1){
            aumento = salario + (salario * 0.5);
            System.out.print("O seu salario agora é de "+ aumento);
        }
        if(cargo == 2){
            aumento = salario + (salario * 0.35);
            System.out.print("O seu salario agora é de "+ aumento);
        }
        if(cargo == 3){
            aumento = salario + (salario * 0.2);
            System.out.print("O seu salario agora é de "+ aumento);
        }
        if(cargo == 4){
            aumento = salario + (salario * 0.1);
            System.out.print("O seu salario agora é de "+ aumento);
        }
        if(cargo == 5){
            System.out.print("Você não recebe aumento!");
        }



    }
}
