/*
    Fazer um programa para ler um número inteiro e dizer se este número 
    é par ou ímpar
 */

package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Udemy {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        
        System.out.println("DIGITE UM NUMERO");
        numero = sc.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        sc.close();
    }

}
