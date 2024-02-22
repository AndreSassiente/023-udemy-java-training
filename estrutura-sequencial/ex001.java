/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.*/

package udemyjava;

import java.util.Scanner;

public class UdemyJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorA;
        int valorB;
        int soma;

        System.out.print("VALOR A: ");
        valorA = sc.nextInt();

        System.out.print("VALOR B: ");
        valorB = sc.nextInt();

        soma = valorA + valorB;

        System.out.println("SOMA = " + soma);
        sc.close();
    }

}
