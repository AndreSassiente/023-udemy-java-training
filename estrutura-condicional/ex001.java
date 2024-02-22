/*
    Fazer um programa para ler um número inteiro, e depois dizer se este
    número é negativo ou não.
 */

package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Udemy {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor;
        
        System.out.println("DIGITE O VALOR");
        valor = sc.nextInt();
        
        if (valor < 0) {
            System.out.println("VALOR NEGATIVO");
        } else {
            System.out.println("VALOR POSITIVO");
        }

        sc.close();
    }

}
