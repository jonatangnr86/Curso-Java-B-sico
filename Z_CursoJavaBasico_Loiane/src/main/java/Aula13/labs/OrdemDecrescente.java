package Aula13.labs;

import java.util.Scanner;

public class OrdemDecrescente {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] mat = new int[3];

        for (int i = 0; i < mat.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° número");
            mat[i] = scan.nextInt();
        }

        System.out.println("");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 1; j < mat.length; j++) {

                if (mat[i] > mat[j]) {
                    int x = mat[j];
                    mat[j] = mat[i];
                    mat[i] = x;
                }

            }
        }
        
             System.out.println("Ordem crescente");

            System.out.println(mat[0]);
            System.out.println(mat[1]);
            System.out.println(mat[2]);
    }

}
