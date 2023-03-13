package br.com.dio.exercicios.loop;

import java.util.Scanner;
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5! = 120
 */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, multiplicacao = 1, contador;

        System.out.println("---------------------");
        System.out.println("-------FATORIAL------");
        System.out.println("Digite um número: ");
        numero = scan.nextInt();

        for (contador = numero;contador >= 1;contador--){ //contador começa na entrada do usuario "numero" e decrementa o contador
            multiplicacao *= contador; //multipplicacao = multiplicacao * contador;
        }
        System.out.println("Fatorial de " + numero + " é igual a " + multiplicacao);
    }
}
