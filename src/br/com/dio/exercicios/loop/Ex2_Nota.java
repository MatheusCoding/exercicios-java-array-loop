package br.com.dio.exercicios.loop;
import java.util.Scanner;
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usuário informe um valor válido.
 */
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10){ //Enquanto a true vai pedir a nota
            System.out.println("Nota inválida! Digite novamente: ");
            nota= scan.nextInt();

        }
    }
}
