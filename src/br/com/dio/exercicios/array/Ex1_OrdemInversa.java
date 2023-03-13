package br.com.dio.exercicios.array;
/*
Crie um Vetor de 6 numeros inteiros e
mostre-os na ordem inversa.
 */
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 30, 8, 4}; // 5 posições, tamanho 6 (começa no 0 as posições)
        int contador = 0;

        System.out.print("V\nVetor: ");
        while(contador < (vetor.length)){
            System.out.print(vetor[contador]+ " ");
            contador++;
        }
        System.out.print("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i]+ " ");
        }
    }
}
