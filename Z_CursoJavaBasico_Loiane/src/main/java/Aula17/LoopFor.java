
package Aula17;


public class LoopFor {
    public static void main(String[] args) {
        
        
        //Executa o loop enquanto a condição for true---------------------------
        
        for(int i = 0; i < 5; i++) {
       
        System.out.println("Valor de i é; " + i);      
        
        } 
        for(int i = 0, j = 10; i < j; i++, j--){
            
            System.out.println("i = " + i + " j = " + j); 
        }
        //Colocar dois pontos e virrgula na condição----------------------------
        int cont = 0;
        
        for (;cont < 5 ;){
          System.out.println("Valor de cont é; " + cont);
            
        }
    }
}
