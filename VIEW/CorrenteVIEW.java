package VIEW;
import DTO.CorrenteDTO;
import javax.swing.JOptionPane;

public class CorrenteVIEW extends ContaVIEW{

    CorrenteDTO correnteDTO = new CorrenteDTO();

    public void valor_cc (){
        correnteDTO.setValor_cc(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta corrente: ")));
    }
}