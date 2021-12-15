
package Aula12;

import java.util.Scanner;


public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = scan.next();
        
        System.out.println("Digite seu sobrenome: ");
        String sobreNome = scan.next();
        
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        
        
      System.out.println("Seu nome é: " + nome);
      System.out.println("Seu sobrenome é: " + sobreNome);
      System.out.println("Sua idade é: " + idade);
        
    }
}
