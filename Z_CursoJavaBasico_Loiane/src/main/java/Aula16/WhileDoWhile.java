package Aula16;

/**
 *
 * @author jonat
 */
public class WhileDoWhile {

    public static void main(String[] args) {

        int i = 0;
        int max = 10;

        System.out.println("Contando até " + max);

        
        // Avalia a espressão e depois executa----------------------------------
        while (i <= max){
            
             System.out.println("VAlor de i:  " + i);
             i++;         
        }
        
        
        do { // Primeiro executa e depois avalia a expressão--------------------
            System.out.println("VAlor de i:  " + i);
            i++;
        } while (i <= 20);
    }

}
