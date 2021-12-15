package Aula20;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArrrayMatrizes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Cria uma matriz 3x3
        int[][] poltronas = new int[3][3];

       // System.out.println("Digite um numero: ");
        //int num = scan.nextInt();

        for (int i = 0; i < poltronas.length; i++) {
            for (int j = 0; j < poltronas.length; j++) {

                String st = "Informe a linha " + i + " e coluna " + j;
                
                st = JOptionPane.showInputDialog(null, st); // Faz a leitura do valor inserido

                if (st == null || st.length() < 0) { // length faz a contagem da variavel, 
                    JOptionPane.showMessageDialog(null, "É necessário informar valor!"); // Se não informar valor exibe msg
                } else {
                    poltronas[i][j] = (int) Double.parseDouble(st); // Se informar valor matriz recebe o valor em inteiro
                }
            }
        }

        for (int i = 0; i < poltronas.length; i++) {
            for (int j = 0; j < poltronas.length; j++) {

                //System.out.print(poltronas[i][j]);
                
                JOptionPane.showMessageDialog(null, poltronas[i][j]);

            }
            System.out.println("");                    
        }

    }

}
