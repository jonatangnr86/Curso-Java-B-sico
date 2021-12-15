package Aula13;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int diaSemana = 0;
        System.out.println("Digite um dia da semana:");
        diaSemana = scan.nextInt();
        /*
        if (diaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaSemana == 2) {
            System.out.println("Segunda feira");
        }else if (diaSemana == 3) {
            System.out.println("Terça feira");
        }else if (diaSemana == 4) {
            System.out.println("Quarta feira");
        } else if (diaSemana == 5) {
            System.out.println("Quinta feira");
        }else if (diaSemana == 6) {
            System.out.println("Sexta feira");
        }else if (diaSemana == 7) {
            System.out.println("Sábado");
        }else {
            System.out.println("Não é um dia validao");

        }
        **/
        
        // Compara-se a função escolha-caso ------------------------------------
        switch (diaSemana) {

            case 1:
                System.out.println("Domingo"); break; // Colocar Break para parar execução
            case 2:
                System.out.println("Segunda"); break;
            case 3:
                System.out.println("Terça"); break;
            case 4:
                System.out.println("Quarta"); break;
            case 5:
                System.out.println("Quinta"); break;                     
            case 6:
                System.out.println("Sexta"); break;
            case 7:
                System.out.println("Sábado"); break;

        }
    }

}
