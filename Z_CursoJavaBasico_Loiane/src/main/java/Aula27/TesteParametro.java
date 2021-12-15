
package Aula27;

public class TesteParametro {
    
    public static void main(String[] args) {
        
      
         //=============== Classe por parametro ================================
         
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
        
        double autonomia = van.obterAutonomia(); // O valor reorno pode ser atribuido a variável
        
        System.out.println("Autonomia do carro é: " + autonomia);
        System.out.println("Autonomia do carro é: " + van.obterAutonomia()); // método chamado em concatenação
        
        
        double qtdCombustivel20 = van.calcularCombustivel(20); // Passa por parâmatro o valor para metódo da classe carro
        double qtdCombustivel30 = van.calcularCombustivel(30); // Passa por parâmatro o valor para metódo da classe carro
        
        
        System.out.println("Combustivel para 20 km: " + qtdCombustivel20);      
        System.out.println("A marca do carro é: " + van.marca);
        
        
       
    }
                                          
}
