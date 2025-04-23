package VIEW; 
import javax.swing.JOptionPane;
import DTO.ClienteDTO;

public class ClienteVIEW {

    ClienteDTO clienteDTO = new ClienteDTO();

    public void nome_cliente(){
        clienteDTO.setNome_cliente(JOptionPane.showInputDialog("Qual o nome do cliente: "));
    }
}