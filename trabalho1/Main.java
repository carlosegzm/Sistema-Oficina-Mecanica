package trabalho1;

public class Main {

    public static void main(String[] args) {

        Oficina oficina = new Oficina(); //Criar a oficina

        try {

            //Ciração dos veiculos
            Carro carro = new Carro(4, "ASK3405", "Volkswagen", "TCross");
            Carro carro2 = new Carro(4, "GOD3333", "Peugeot", "206");
            Moto moto = new Moto(true, "KLE0322", "Honda", "CG 160");

            oficina.addVeiculo(carro);
            oficina.addVeiculo(carro2);
            oficina.addVeiculo(moto);

            //Criação dos serviços
            Servico s1 = new Servico("Troca de óleo", 150);
            Servico s2 = new Servico("Refazer Motor", 7000);
            Servico s3 = new Servico("Alinhamento", 100);

            oficina.addServico(s1);
            oficina.addServico(s2);
            oficina.addServico(s3);

            //Erro controlado
            try {
                Servico invalido = new Servico("Revisão", -50);
                oficina.addServico(invalido);
            } catch (ServicoInvalido e) {
                //Mensagem para o usuario
                System.out.println("Erro ao adicionar o serviço: " + e.getMessage());
            }

            //Exibe os veiculos
            System.out.println("\n -> Veículos Cadastrados <-");
            oficina.listarV();

            //Exibe os serviços
            System.out.println("\n -> Serviços Realizados <-");
            oficina.listarS();

        } catch (ServicoInvalido e) {
            //Caso alguma outra excecao ocorra
            System.out.println("Erro no sistema: " + e.getMessage());
        } finally {
            //Executado sempre, com ou sem erro
            System.out.println("\n Sistema Finalizado!");
        }

    }
}
