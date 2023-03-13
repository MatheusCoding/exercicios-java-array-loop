package br.com.dio.exercicios.loop;

import java.util.Scanner;

public class Ex4_ParEImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantNumeros, numeros, par = 0, impar = 0, contador = 0;

        System.out.println("Quantas vezes você deseja contar: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Digite um número: ");
            numeros = scan.nextInt();
            contador++;
            if (numeros % 2 == 0) par++;
            else impar++;
        } while(contador < quantNumeros);

        System.out.println("Você escolheu " + quantNumeros + " números!");
        System.out.println("Foram escolhidos " + par + " pares!");
        System.out.println("Foram escolhidos " + impar + " impares!");
    }
}
