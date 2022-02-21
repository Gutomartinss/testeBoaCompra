import empresa.Empresa;
import produto.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Produto foneDeOuvido1 = new Produto(1,1);
        Produto foneDeOuvido2 = new Produto(430,1);
        Produto foneDeOuvido3 = new Produto(33,1);
        Produto foneDeOuvido4 = new Produto(50,1);
        Produto controleXbox1 = new Produto(1,3);
        Produto controleXbox2 = new Produto(100,3);
        Produto pcGamer = new Produto(1000,35);
        Produto kitGamer = new Produto(1000,5); 
        Produto tecladoMaisFone = new Produto(5,6);

        Empresa boaDex = new Empresa("BoaDex",10,0.05);
        Empresa boaLog = new Empresa("BoaLog",4.30,0.12);
        Empresa transBoa = new Empresa("Transboa",2.10,1.10);

    }

    public static double calculaCusto(Produto brinde, Empresa transportadora){

        double custoDeEnvio = transportadora.valor_Fixo + (brinde.peso*brinde.distancia*transportadora.valorKgKm);
     
        return custoDeEnvio;
     }

}
