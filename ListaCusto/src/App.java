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
        Produto pcGamer2 = new Produto("PC_Gamer",1,35);
        Produto kitGamer = new Produto("Kit_Gamer",1000,5); 
        Produto tecladoMaisFone = new Produto("TecladoMaisFone",5,6);

        Produto [] arrayDeProdutos = {foneDeOuvido1,foneDeOuvido2,foneDeOuvido3,foneDeOuvido4,controleXbox1,
        controleXbox2,pcGamer,pcGamer2, kitGamer,tecladoMaisFone};

        Empresa boaDex = new Empresa("BoaDex",10,0.05);
        Empresa boaLog = new Empresa("BoaLog",4.30,0.12);
        Empresa transBoa = new Empresa("Transboa",2.10,1.10);

        Empresa [] arrayDeEmpresa = {boaDex,boaLog,transBoa};

        Custo [] arrayDeCustos = new Custo[30];

        inicializaArrayDeCustos(arrayDeCustos, 30);
        

        calculaCusto(arrayDeCustos,arrayDeProdutos, arrayDeEmpresa);

    }

    public static void calculaCusto(Custo[] arrayDeCustos, Produto[] arrayDeBrinde, Empresa[] arrayDeTransportadora){

        int contadorEmpresa = 0;
        
        

        while(contadorEmpresa<=2){

            
         
          for(int i=0;i<10;i++){
            
            arrayDeCustos[i].custoEnvio = arrayDeTransportadora[contadorEmpresa].valor_Fixo+(arrayDeBrinde[i].peso*
            arrayDeBrinde[i].distancia*arrayDeTransportadora[contadorEmpresa].valorKgKm);

            arrayDeCustos[i].nomeDoProduto = arrayDeBrinde[i].nome;
            arrayDeCustos[i].nomeDaTransportadora = arrayDeTransportadora[contadorEmpresa].nome;

          }
          contadorEmpresa=contadorEmpresa+1;

        }

        listaCustos(arrayDeCustos);
       // return arrayDeCustos;
    }

    public static void listaCustos(Custo[] arrayDeCustos){
        for(int i=0;i<30;i++){
            System.out.println("Produto: " + arrayDeCustos[i].nomeDoProduto+" Empresa: "+arrayDeCustos[i].nomeDaTransportadora);
        }
    }

    public static void inicializaArrayDeCustos(Custo[] arrayDeCustos, double tamanhoArray){
        for(int i=0;i<tamanhoArray;i++){
            arrayDeCustos[i] = new Custo();
        }
    }

}
