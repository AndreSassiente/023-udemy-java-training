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
        
        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();
        
        while (senha != 2002) {
            System.out.println("Senha invalida. Tente novamente: ");
            senha = sc.nextInt();
        }
        
        System.out.println("Acesso permitido");
        
        sc.close();
    }

}
