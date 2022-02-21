package empresa;

public class Empresa{

    double valor_Fixo;
    double valorKgKm;
   String nome;

   Empresa(){

   }

   Empresa(String novoNome, double novoValor_Fixo, double novoValorKgKm){

       valor_Fixo = novoValor_Fixo;
       valorKgKm = novoValorKgKm;
       nome = novoNome;
   }

  /* public void checaValorFixo(Produto brinde){
       if(brinde.peso>5){
           valor_Fixo = 10;
           valorKgKm = 0.01;
       }
   }*/

}