package trabalho1;

import java.util.ArrayList;

public class Oficina {

    private ArrayList<Veiculo> veiculos; //lista de vaiculos
    private ArrayList<Servico> servicos; //lista de seriços

    //Construtor que inicializa as listas
    public Oficina() {
        veiculos = new ArrayList<>();
        servicos = new ArrayList<>();
    }

    //Adiciona um veículo na lista
    public void addVeiculo(Veiculo v) {
        veiculos.add(v);
    }

    //Remove um veículo na lista
    public void removeVericulo(Veiculo v) {
        veiculos.remove(v);
    }

    //Lista todos os veiculos
    public void listarV() {
        for (Veiculo v : veiculos) {
            v.exibir();
        }
    }

    //Adiciona um serviço na lista
    public void addServico(Servico s) {
        servicos.add(s);
    }

    //Remove um serviço na lista
    public void removeServico(Servico s) {
        servicos.remove(s);
    }

    //Lista todos os serviços
    public void listarS() {
        for (Servico s : servicos) {
            s.realizarServico();
        }
    }

}
