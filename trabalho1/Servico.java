package trabalho1;

public class Servico implements ServicoRealizavel {

    private String descricao;
    private double preco;

    //Construtor com validaçao de preço
    public Servico(String descricao, double preco) throws ServicoInvalido {

        //Lança a exceção se o preço for invalido
        if (preco < 0) {
            throw new ServicoInvalido("Preço do serviço não pode ser negativo.");
        }

        this.descricao = descricao;
        this.preco = preco;
    }

    //Getters para acessar os atributos
    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    //Implementação do metodo da interface
    @Override
    public void realizarServico() {
        System.out.println("Serviço Realizado: " + descricao + " | R$" + preco);
    }

}
