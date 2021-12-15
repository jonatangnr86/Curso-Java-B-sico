package Aula19;

import java.util.Scanner;

public class ArraysVetores {

    public static void main(String[] args) {

        //Armazenar temperatura por 1 ano
        /* Primeiro colchete indica a matriz
         * Segundo colchete qtd de posições
        **/
        double[] temperatura = new double[365]; // Cria o vetor de 365 posições

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < temperatura.length; i++) { 
        // temperatura.length "A quantidade de posições definidas para o array.

            System.out.println("Digite um numero: ");
            temperatura[i] = scan.nextDouble();
          if (i == 4){ // Se i = 4 para a execução do for
              break;              
          }
        }

           for(int i = 0; i < temperatura.length; i++){
               
               System.out.println("A temperatura do dia " + (i + 1) + " é: " + temperatura[i]);
                
               if (i == 4){ // Se i = 4 para a execução do for
              break;              
          }
           }    

    }
}
