/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Banco2.VIEW;

import javax.swing.JOptionPane;
import com.Banco2.DTO.ClienteDTO;
import com.Banco2.DTO.CorrenteDTO;
import com.Banco2.DTO.PoupancaDTO;

public class ClienteVIEW {

    public void nome_cliente(ClienteDTO clienteDTO){
        clienteDTO.setNome_cliente(JOptionPane.showInputDialog("Qual o nome do cliente: "));
    }
    
    public void saldo(CorrenteDTO correnteDTO, PoupancaDTO poupancaDTO){
        JOptionPane.showMessageDialog(null, "Saldo da Conta Corrente: R$" + correnteDTO.getValor_cc() + ""
        + "\nSaldo da Poupança: R$" + poupancaDTO.getValor_pp());
    }
}
