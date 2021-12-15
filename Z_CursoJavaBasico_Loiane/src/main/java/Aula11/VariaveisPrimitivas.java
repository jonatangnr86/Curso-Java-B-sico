/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula11;

/**
 *
 * @author jonat
 */
public class VariaveisPrimitivas {

    public static void main(String[] args) {

        //Variáveis Inteiras----------------------------------------------------
        byte idade = 20;
        short idade01 = 21;
        int idade02 = 34;
        long idade03 = 31;
        
        System.out.println("Valor da variavel: " + idade);
        System.out.println("Valor da variavel: " + idade01);
        System.out.println("Valor da variavel: " + idade02);
        System.out.println("Valor da variavel: " + idade03);
        
        
        //Variáveis Flutuantes--------------------------------------------------
        
        double valorPassagem = 2.90;
        float tomate = 3.95f;
        
        System.out.println("Valor da passagem: " + valorPassagem );
        System.out.println("Valor do tomate: " + tomate );
        
        //Variáveis Char--------------------------------------------------------
        
        char o = 'o';
        char i = 'i';
        
        System.out.println("" + o + i);
        
        //Variáveis Boolean-----------------------------------------------------
        
        boolean falso = false;
        boolean vdd = true;
        
        System.out.println("O valor de vdd é: " + vdd);
        System.out.println("O valor de falso é: " + falso);
        
        //Curiosidaes-----------------------------------------------------------
        
        int var = 2147483647;
        int var1 = 100;
        
        
        System.out.println(var + var1);
        
        /*Variavel inteira armazena até 2147483647, se adicionar mais numeros
        * começa a contar do primeiro negativo.
        */ 
     
     //
        
        
        
    }
}
