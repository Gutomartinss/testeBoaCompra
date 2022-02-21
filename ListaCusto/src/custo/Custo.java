package custo;

public class Custo {
    public double custoEnvio;
    public String nomeDoProduto;
    public String nomeDaTransportadora;


    public Custo(){

    }
    
    public Custo(double novoCustoEnvio, String novoNomeDoProduto, String novoNomeDaTransportadora){
        custoEnvio = novoCustoEnvio;
        nomeDoProduto = novoNomeDoProduto;
        nomeDaTransportadora = novoNomeDaTransportadora;
    }
}


