/*
    Um posto de combustivel deseja determinar qual de seus produtos tem a 
    preferencia de seus clientes. Escreva um algoritmo para ler o tipo de 
    combustivel abastecido (codificado da seguinte forma: 1. Alcool 2.Gasolina
    3.Diesel 4.Fim). Caso o usuario informe um codigo invalido (fora da caixa de
    1 a 4) dever ser solicitado um novo codigo (ate que seja valido). O programa
    sera encerrado quando o codigo informado for o numero 4. Deve ser escrito a 
    mensagem "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
    tipo de combustivel.
 */
package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Udemy {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        System.out.println("1. ALCOOL");
        System.out.println("2. GASOLINA");
        System.out.println("3. DIESEL");
        System.out.println("4. FIM");
        
        int tipo = sc.nextInt();
        
        while (tipo != 4) {
            
            if (tipo == 1 ) {
                alcool++;
            } else if (tipo == 2) {
                gasolina++;
            } else if (tipo == 3) {
                diesel++;
            }
            
            tipo = sc.nextInt();
            
        }
        
        System.out.println("[ MUITO OBRIGADO ]");
        System.out.println("ALCOOL: " + alcool);
        System.out.println("GASOLINA: " + gasolina);
        System.out.println("DIESEl: " + diesel);
        
        sc.close();
        
    }

}
