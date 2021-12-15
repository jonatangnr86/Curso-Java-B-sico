
package Aula26;


public class TesteObterAutonomia {
    
    public static void main(String[] args) {
        
        
         //=============== Classe e Método com retorno =========================
         
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
        
       
    }
    
    
}
