package com.company;

import java.util.Scanner;

public class exercicio07_02 {

    public static String diaSemana (String x){
          /*
        if(x == 1){
            System.out.print("Você ta no Domingo-feira!");
        }
        else if(x ==2){
            System.out.print("Você ta na Segunda-feira!");
        }
        else if(x ==3){
            System.out.print("Você ta na Terça-feira!");
        }
        else if(x ==4){
            System.out.print("Você ta na Quarta-feira!");
        }
        else if(x ==5){
            System.out.print("Você ta na Quinta-feira!");
        }
        else if(x ==6){
            System.out.print("Você ta na Sexta-feira!");
        }
        else if(x ==7){
            System.out.print("Você ta no Sabado-feira!");
        }
        return x;
        */

        switch(x){
            case "1":
                return "Domingo";

            case "2":
                return "Segunda-feira";

            case "3":
                return "Terça-feira";

            case "4":
                return "Quarta-feira";

            case "5":
                return "Quinta-feira";

            case "6":
                return "Sexta-feira";

            case "7":
                return "Sábado-feira";

        }
        return x;


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String dia;

        System.out.print("Informe um numero de 1 a 7: ");
        dia = sc.nextLine();

        System.out.print("o dia da semana é : ");
        System.out.println(diaSemana(dia));

    }
}
