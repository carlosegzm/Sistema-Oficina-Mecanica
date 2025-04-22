package trabalho1;

public class Carro extends Veiculo {

    private int portas;

    //Construtor
    public Carro(int portas, String placa, String marca, String modelo) {
        super(placa, marca, modelo); //Chamada ao construtor da superclasse
        this.portas = portas;
    }

    //Get para acessar o atributo
    public int getPortas() {
        return portas;
    }

    //Sobrescreve o método abstrato da classe Veiculo
    @Override
    public void exibir() {
        System.out.println("CARRO -> Placa: " + placa + " | Marca: " + marca + " | Modelo: " + modelo + " | Portas: " + portas);
    }

}
