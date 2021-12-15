package Aula25;

public class Carro {
    // Atributos
    String marca;
    String modelo;
    int numeroPassageiros;
    double capCombustivel;
    double consCombustivel;

    
     //nome de metodo como verbo
    void exibirAutonomia() { // Cria método
      
        System.out.println("A autonomia do carro é: " + capCombustivel * consCombustivel + " KM");

    }
}
