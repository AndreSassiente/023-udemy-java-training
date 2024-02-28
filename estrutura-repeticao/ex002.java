/*
    Escreva um programa que repita a leitura de uma senha até que ela seja 
    valida. Para cada leitura de senha incorreta informada, escrever a mensagem
    "Senha invalida". Quando a senha for informada corretamente deve ser 
    impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere
    que a senha correta é o valor 2002.
 */
package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Udemy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }

}
