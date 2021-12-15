package Aula12;

import java.util.Scanner;

public class ScanEntradaDados {

    public static void main(String[] args) {

        // Cria objeto de entrada scanner---------------------------------------
        Scanner scan = new Scanner(System.in);

        //Le a linha inteira----------------------------------------------------
        System.out.println("Escreva seu nome completo: ");
        String nomeCompleto = scan.nextLine();

        System.out.println("seu nome completo: " + nomeCompleto);

        // le a primeira palavra digitada--------------------------------------
        System.out.println("Escreva seu 1° nome: ");
        String nome = scan.next();

        System.out.println("seu 1° nome: " + nome);

        //Le numero inteiro-----------------------------------------------------
        System.out.println("Sua idade:");
        int idade = scan.nextInt();

        System.out.println("Sua idade é: " + idade);

        //Ler numero double---------------------------------------------------
        System.out.println("Sua Altura:");
        double altura = scan.nextDouble();

        System.out.println("Sua aultura é: " + altura);
        
        // Ler varias informações
        System.out.println("Sua idade, altura, nome, gato: ");
         int i = scan.nextInt();
         double alt = scan.nextDouble();
         String nom = scan.next();
         String cat = scan.next();
         
          System.out.println("Sua idade é: " + i);
          System.out.println("Sua altura é: " + alt);
          System.out.println("Sua nome é: " + nom);
          System.out.println("Sua gato é: " + cat);

    }

}
