
package Aula18;

import java.util.Scanner;


public class BreakContinue {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um número");
        int num = scan.nextInt();
        
      System.out.println("Entre com um limite");
         int max = scan.nextInt();
         
         
        for (int i = num; i <= max; i++){ 
            if(i % 7 == 0){
                System.out.println("Valor de i é: " + i);
                break; // Quando encntrar o primeiro divisivel por 7 sai do forS
            }
            
        }
        
        
    }
 
}
