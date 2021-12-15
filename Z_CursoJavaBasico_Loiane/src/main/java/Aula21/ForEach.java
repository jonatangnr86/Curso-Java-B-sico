package Aula21;

import java.util.Random;
import java.util.Scanner;

public class ForEach {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] notas = new int[10];

        Random random = new Random(); //Atribiu números aleatórios 

        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextInt(10); // Atribiu números aleatórios ao array de 0 a 10 
            int nota = notas[i];
            System.out.println(nota);

        }
        
        System.out.println("Usando for each");
        //Usando o for each

        for (int nota : notas) {

            System.out.println(nota);

        }

    }
}
