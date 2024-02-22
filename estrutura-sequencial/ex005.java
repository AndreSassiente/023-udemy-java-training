/*
    Fazer um programa que leia o código de uma peça 01, o número de peças 01,
    o valor unitário de cada peça 01, o código de uma peça 02, o número de peças
    02 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Udemy {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qtd1, qtd2;
        double price1, price2, total;
        
        cod1 = sc.nextInt();
        qtd1 = sc.nextInt();
        price1 = sc.nextDouble();
        
        cod2 = sc.nextInt();
        qtd2 = sc.nextInt();
        price2 = sc.nextDouble();
        
        total = (price1 * qtd1) + (price2 * qtd2);
        
        System.out.printf("VALOR TOTAL: R$ %.2f %n", total);
        
        sc.close();
    }

}
