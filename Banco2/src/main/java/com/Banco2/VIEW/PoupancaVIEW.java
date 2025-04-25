/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Banco2.VIEW;
import com.Banco2.DTO.PoupancaDTO;
import javax.swing.JOptionPane;
import com.Banco2.CTR.PoupancaCTR;
import com.Banco2.VIEW.PrincipalVIEW;
import com.Banco2.DTO.ContaDTO;
import com.Banco2.DTO.ClienteDTO;
import com.Banco2.DTO.CorrenteDTO;

public class PoupancaVIEW extends ContaVIEW{
    PoupancaCTR poupancaCTR = new PoupancaCTR();
    PoupancaDTO poupancaDTO = new PoupancaDTO();
    PrincipalVIEW principalVIEW = new PrincipalVIEW();
    ContaDTO contaDTO = new ContaDTO();
    ClienteDTO clienteDTO = new ClienteDTO();
    CorrenteDTO correnteDTO = new CorrenteDTO();
    
    public void valor_pp (PoupancaDTO poupancaDTO){
        poupancaDTO.setValor_pp(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da poupança: ")));
    }
    
    public void deposito() {
        String input = JOptionPane.showInputDialog("Informe qual o valor que deseja depositar (caso deixe o campo vazio, voltará ao menu):");

        if (input == null || input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vazio. Retornando ao menu.");
            return;
        } else{
    
            poupancaDTO.setDeposito(Double.parseDouble(input));
            JOptionPane.showMessageDialog(null, poupancaCTR.deposito());
        }
        
        principalVIEW.menu(clienteDTO, contaDTO, correnteDTO, poupancaDTO);
   
    }
    
    public void sacar (){
        String input = JOptionPane.showInputDialog("Informe qual o valor que deseja depositar na Poupança (caso deixe o campo vazio, voltará ao menu):");

        if (input == null || input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vazio. Retornando ao menu.");
            return;
        } else{
            poupancaDTO.setDeposito(Double.parseDouble(input));
            JOptionPane.showMessageDialog(null, poupancaCTR.saque());
        }
        
        principalVIEW.menu(clienteDTO, contaDTO, correnteDTO, poupancaDTO);
    }
}
