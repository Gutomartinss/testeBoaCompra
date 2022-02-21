package produto;

public class Produto {

    public double peso;
    public double distancia;
    public String nome;

   public Produto(){


    }

    public Produto(String novoNome, double novaDistancia, double novoPeso){
        
        nome = novoNome;
        distancia = novaDistancia;
        peso = novoPeso;
        
    }
}
