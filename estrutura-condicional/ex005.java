/*
    Com base na tabela abaixo, escreva um programa que leia o codigo de um 
    item e a quantidade deste item. A seguir, calcule e mostre o valor da conta
    a pagar.

    CODIGO  PRECO
    1       4.00
    2       4.50
    3       5.00
    4       2.00   
    5       1.50
 */

package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Udemy {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double total = 0;
        
        switch (codigo) {
            case 1:
                total = quantidade * 4.0;
                break;
            case 2:
                total = quantidade * 4.5;
                break;
            case 3:
                total = quantidade * 5.0;
                break;
            case 4:
                total = quantidade * 2.0;
                break;
            case 5:
                total = quantidade * 1.5;
                break;
            default:
                System.out.println("ERRO");
                break;
        }
        
        System.out.printf("TOTAL: %.2f %n", total);

        sc.close();
    }

}
