package br.com.dio.exercicios.loop;

import java.util.Scanner;
/*
    Desenvolva um gerador de tabuada,
    capaz de gerar a tabuada de qualquer valor inteiro entre 0 a 10.
    O usuário deve informar qual numero ele deseja vera a tabuada.
    A saída deve ser conforme o exemplo abaixo
*/
public class Ex5_Tabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, contador = 0, resultado;
        System.out.println("--------------------------");
        System.out.println("---------TABUADA----------");
        System.out.println("DIGITE UM NÚMERO: ");
        numero = scan.nextInt();

        //for(contador = 0; contador <= 10; contador++) // caso queira usar o for
        if (numero > 0 && numero < 10) {
            do {
                resultado = numero * contador;
                //System.out.println(numero + " X " + contador + " = " + resultado); //usando concatenação
                System.out.printf("%d X %d = %d\n", numero, contador, resultado); //usando a string formatada e quebra de linhas \n
                contador++;
            } while (contador <= 10);
        }else {
            System.out.println("Por favor digite um número válido entre 0 e 10");
        }
    }
}
