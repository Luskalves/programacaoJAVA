package com.company;

import java.util.Scanner;

public class Letra_D_aula05 {
    public static void main(String[] args){
        char voto;
        int a,b,c,nulo, eleitores;
        Scanner sc = new Scanner(System.in) ;

        a = 0;
        b = 0;
        c = 0;
        nulo = 0;
        System.out.print("Informe a quantidade de eleitores: ");
        eleitores = sc.nextInt();

        for(int n =1;n<=eleitores;n++) {
            System.out.print(n+"° voto: ");
            voto = sc.next().charAt(0);

            if (voto == 'a') {
                a++;
            }
            if (voto == 'b') {
                b++;
            }
            if (voto == 'c') {
                c++;
            }
            if (voto == 'n') {
                nulo++;
            }
        }

        System.out.println("Resultado: ");
        System.out.println("Votaram em A: "+a);
        System.out.println("Votaram em B: "+b);
        System.out.println("Votaram em C: "+c);
        System.out.println("Votaram em Nulo: "+nulo);
    }
}
