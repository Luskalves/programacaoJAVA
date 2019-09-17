package com.company;

import java.util.Scanner;

public class Letra_C_aula05 {
    public static void main(String[] args){
        double capital, juros;
        int mes;
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Informe o capital: ");
        capital = sc.nextDouble();

        System.out.print("Informe o juros: ");
        juros = sc.nextDouble();

        juros = juros/100;

        System.out.print("Informe o periodo: ");
        mes = sc.nextInt();

        for(int n=1; n<=mes;n++) {
            capital = capital+(capital* juros);
            System.out.println(n+"° mes: "+ capital);
            }
        }
    }

