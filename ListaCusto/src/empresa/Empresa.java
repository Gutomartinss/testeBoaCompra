package empresa;

public class Empresa{

   public double valor_Fixo;
   public double valorKgKm;
   public String nome;

   public Empresa(){

   }

   public Empresa(String novoNome, double novoValor_Fixo, double novoValorKgKm){

       valor_Fixo = novoValor_Fixo;
       valorKgKm = novoValorKgKm;
       nome = novoNome;
   }
}