package br.com.dio.exercicios.loop;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
a soma e a média desses números.
 */
public class Ex3_MaiorEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int contador = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;
            if (numero > maior) maior = numero;

            contador++;
        } while (contador < 5);

        System.out.println("Soma: " + soma);
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/contador));
    }
}
