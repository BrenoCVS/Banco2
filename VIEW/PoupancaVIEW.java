package VIEW;
import DTO.PoupancaDTO;
import javax.swing.JOptionPane;

public class PoupancaVIEW extends ContaVIEW{

    PoupancaDTO poupancaDTO = new PoupancaDTO();

    public void valor_pp (){
        poupancaDTO.setValor_pp(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da poupança: ")));
    }
}