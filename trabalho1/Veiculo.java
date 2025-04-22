package trabalho1;

public abstract class Veiculo {

    protected String placa;
    protected String marca;
    protected String modelo;

    //Construtor comum para as subclasses
    public Veiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    //Getters para acessar os atributos
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    //Método abstrato q força as subclasses a implementarem a exibição dos dados
    public abstract void exibir();

}
