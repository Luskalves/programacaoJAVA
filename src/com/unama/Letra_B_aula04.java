package com.unama;

import java.util.Scanner;

public class Letra_B_aula04 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int totalP;
        double pecasD,porcento;

        System.out.print("Infome o total de peças produzidas: ");
        totalP = sc.nextInt();

        System.out.print("Informe a quantidade de peças defeituosas: ");
        pecasD = sc.nextDouble();

        porcento = totalP / 10;

        if(pecasD > porcento){
            System.out.println("A maquina precisa de reparos!");
        }

        else{
            System.out.println("A maquina ta de boa");
        }


    }
}
