package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;
        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU " + duracao + "HORAS");
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
            System.out.println("O JOGO DUROU " + duracao + "HORAS");
        }

    sc.close();
    }
}
