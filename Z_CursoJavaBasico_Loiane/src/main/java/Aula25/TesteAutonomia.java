package Aula25;

public class TesteAutonomia {

    public static void main(String[] args) {

        //=============== Classe e Método Simples===============================
        Carro van = new Carro(); // Cria o objeto van

        van.marca = "Fiat";
        van.modelo = "DFucato";
        van.numeroPassageiros = 10;
        van.capCombustivel = 100;
        van.consCombustivel = 0.2;

        System.out.println("Marca: " + van.marca);
        System.out.println("Modelo: " + van.modelo);
        System.out.println("Passageiros" + van.numeroPassageiros);
        System.out.println("");

        van.exibirAutonomia(); // Chama metodo exibir Autonomia da classe Carro
    }
}
