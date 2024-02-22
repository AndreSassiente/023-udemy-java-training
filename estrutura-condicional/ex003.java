/*
    Leia 02 valores inteiros (A e B). Apos, o programa deve mostrar uma mensagem
    "SAO MULTIPLOS" ou "NAO SAO MULTIPLOS", indicando se os valores são 
    multiplos entre si. Atencao: os numeros devem poder ser digitados em ordem
    crescente ou decrescente.
 */

package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Udemy {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valorA;
        int valorB;
        
        System.out.println("VALOR A");
        valorA = sc.nextInt();
        
        System.out.println("VALOR B");
        valorB = sc.nextInt();
        
        if ((valorA + valorB) % 2 == 0) {
            System.out.println("SAO MULTIPLOS");
        } else {
            System.out.println("NAO SAO MULTIPLOS");
        }

        sc.close();
    }

}
