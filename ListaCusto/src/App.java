import empresa.Empresa;
import produto.Produto;
import custo.Custo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Produto foneDeOuvido1 = new Produto("FoneDeOuvido",1,1);
        Produto foneDeOuvido2 = new Produto("FoneDeOuvido",430,1);
        Produto foneDeOuvido3 = new Produto("FoneDeOuvido",33,1);
        Produto foneDeOuvido4 = new Produto("FoneDeOuvido",50,1);
        Produto controleXbox1 = new Produto("ControleXbox",1,3);
        Produto controleXbox2 = new Produto("ControleXbox",100,3);
        Produto pcGamer = new Produto("PC_Gamer",1000,35);
        Produto kitGamer = new Produto("Kit_Gamer",1000,5); 
        Produto tecladoMaisFone = new Produto("TecladoMaisFone",5,6);

        Produto [] arrayDeProdutos = {foneDeOuvido1,foneDeOuvido2,foneDeOuvido3,foneDeOuvido4,controleXbox1,
        controleXbox2,pcGamer,kitGamer,tecladoMaisFone};

        Empresa boaDex = new Empresa("BoaDex",10,0.05);
        Empresa boaLog = new Empresa("BoaLog",4.30,0.12);
        Empresa transBoa = new Empresa("Transboa",2.10,1.10);

        Empresa [] arrayDeEmpresa = {boaDex,boaLog,transBoa};

    }

    public static double calculaCusto(Produto brinde, Empresa transportadora){

        double custoDeEnvio = transportadora.valor_Fixo + (brinde.peso*brinde.distancia*transportadora.valorKgKm);
     
        return custoDeEnvio;
     }

    public static void listaCustos(){
        
    }

}
