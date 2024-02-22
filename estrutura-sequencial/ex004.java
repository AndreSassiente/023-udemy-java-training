/*
    Fazer um programa que leia o número de um funcionário,
    seu número de horas trabalhadas, o valor que recebe por hora e 
    calcula o salário desse funcionário. A seguir, mostre o 
    número e o salário do funcionário, com duas casas decimais.
 */

package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Udemy {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        int horas;
        double valorHora;
        double salario;
        
        System.out.println("NUMERO FUNCIONARIO: ");
        numero = sc.nextInt();
        
        System.out.println("HORAS TRABALHADAS: ");
        horas = sc.nextInt();
         
        System.out.println("VALOR HORA TRABALHADA: ");
        valorHora = sc.nextDouble();
        
        salario = valorHora * horas;
        
        System.out.println("NUMERO FUNCIONARIO: " + numero);
        System.out.printf("SALARIO: %.2f %n", salario);
        
        sc.close();
    }

}
