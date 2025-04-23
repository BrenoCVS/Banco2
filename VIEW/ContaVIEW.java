package VIEW;
import javax.swing.JOptionPane;
import DTO.ContaDTO;

public class ContaVIEW {
    ContaDTO contaDTO = new ContaDTO();

    public void nome_banco(){
        contaDTO.setNome_banco(JOptionPane.showInputDialog("Insira o nome do seu banco: "));
    }
}