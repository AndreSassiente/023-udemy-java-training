/*
    Leia a hora inicial e a hora final de um jogo. A seguir calcule a duracao
    do jogo, sabendo que o mesmo pode comecar em um dia e terminar em outro, 
    tendo uma duracao minimo de 1 hora e maxima de 24 horas.
 */

package udemy;

import java.util.Locale;
import java.util.Scanner;

public class Udemy {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horaInicial;
        int horaFinal;
        int duracao;
        
        System.out.println("HORA INICIAL");
        horaInicial = sc.nextInt();
        
        System.out.println("HORA FINAL");
        horaFinal = sc.nextInt();
        
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        
        System.out.println("O JOGO DUROU " + duracao + " HORAS.");

        sc.close();
    }

}
