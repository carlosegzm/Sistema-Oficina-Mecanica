package trabalho1;

public class Moto extends Veiculo {

    private boolean partidaEletrica;

    //Construtor
    public Moto(boolean partidaEletrica, String placa, String marca, String modelo) {
        super(placa, marca, modelo); //Chamada ao construtor da superclasse
        this.partidaEletrica = partidaEletrica;
    }

    //Método para retornar se a moto possui partida elétrica ou nao
    public boolean temPartidaEletrica() {
        return partidaEletrica;
    }

    //Sobrescreve o método abstrato do Veiculo
    @Override
    public void exibir() {
        System.out.println("MOTO -> Placa: " + placa + " | Marca: " + marca + " | Modelo: " + modelo + " | Partida Elétrica: " + (partidaEletrica ? "Sim" : "Não"));
    }

}
