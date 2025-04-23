import VIEW.ClienteVIEW;
import VIEW.CorrenteVIEW;
import VIEW.PoupancaVIEW;
import VIEW.ContaVIEW;

public class Main {
    public static void main(String[] args){
        ClienteVIEW clienteVIEW = new ClienteVIEW();
        ContaVIEW contaVIEW = new ContaVIEW();
        PoupancaVIEW poupancaVIEW = new PoupancaVIEW();
        CorrenteVIEW correnteVIEW = new CorrenteVIEW();

        clienteVIEW.nome_cliente();
        contaVIEW.nome_banco();
        


    }
}