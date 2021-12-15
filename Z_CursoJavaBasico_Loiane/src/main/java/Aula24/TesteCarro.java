
package Aula24;


public class TesteCarro {
    public static void main(String[] args) {
        
        Carro van = new Carro(); // Cria o objeto van
        
        van.marca = "Fiat";
        van.modelo = "DFucato";
        van.numeroPassageiros = 10;
        van.capCombustivel = 100;
        van.consCombustivel = 0.2;
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numeroPassageiros);
        System.out.println("");
        
        Carro fusca = new Carro(); // Cria o Objeto fusca
        
        fusca.marca = "Volks";
        fusca.modelo = "1300l";
        fusca.numeroPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consCombustivel = 0.3;
        
         
        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numeroPassageiros);
        
         
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        System.out.println(fusca.numeroPassageiros);
        
        
        
    }
 
}
