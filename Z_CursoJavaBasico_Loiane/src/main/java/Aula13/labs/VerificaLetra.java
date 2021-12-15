
package Aula13.labs;

import java.util.Scanner;

public class VerificaLetra {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com uma letra (F ou M):");
        String input = scan.next();
        
        if (input.equalsIgnoreCase("f")){             // erifica se a letra digitada é f
            System.out.println("F - feminino");
        } else if (input.equalsIgnoreCase("m")){      // Verifica se a letra didgitada é m
            System.out.println("M - masculino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
}
