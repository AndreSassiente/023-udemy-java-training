/*
    Fazer um programa que leia três valores com ponto flutuante de dupla 
    precisão: A, B e C. Em seguida, calcule e mostre:

    * A área do triângulo que tem A por base e C por altura
    * A área do círculo de raio C (pi = 3.14159)
    * A área do trapézio que tem A e B por bases e C por altura
    * A área do quadrado que tem lado B
    * A área do retângulo que tem lados A e B
 */

package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Udemy {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, D;
        double triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.println("VALOR DE A");
        A = sc.nextDouble();

        System.out.println("VALOR DE B");
        B = sc.nextDouble();

        System.out.println("VALOR DE C");
        C = sc.nextDouble();

        triangulo = (A * C) / 2.0;
        circulo = 3.14159 * (C * C);
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }

}
