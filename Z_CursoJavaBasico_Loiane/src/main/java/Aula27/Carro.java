
package Aula27;

public class Carro {
    
    //===================Método Por parâmetro ==================================
    
    // Declaração de Atributos
    String marca;
    String modelo;
    int numeroPassageiros;
    double capCombustivel;
    double consCombustivel;

    //nome de metodo como verbo
    void exibirAutonomia() { // Cria método

        System.out.println("A autonomia do carro é: " + capCombustivel * consCombustivel + " KM");

    }

    double obterAutonomia() { // Cria método com retorno

        System.out.println("Método obter autonomia foi chamado.");
        
        return capCombustivel * consCombustivel;
               
    }
       
        double calcularCombustivel(double km){
            
           
        return km/consCombustivel;  
        
    }
}
