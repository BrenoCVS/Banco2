/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Banco2.VIEW;

import com.Banco2.DTO.CorrenteDTO;
import com.Banco2.CTR.CorrenteCTR;
import javax.swing.JOptionPane;
import com.Banco2.DTO.ClienteDTO;
import com.Banco2.VIEW.PrincipalVIEW;

public class CorrenteVIEW extends ContaVIEW{

    CorrenteDTO correnteDTO = new CorrenteDTO();
    CorrenteCTR correnteCTR =  new CorrenteCTR();
    ClienteDTO clienteDTO = new ClienteDTO();
    PrincipalVIEW principalVIEW = new PrincipalVIEW();

    public void valor_cc (){
        correnteDTO.setValor_cc(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta corrente: ")));
    
    }
    
    public void deposito(){
        String input = JOptionPane.showInputDialog("Informe qual o valor que deseja depositar na Conta Corrente (caso deixe o campo vazio, voltará ao menu):");

        if (input == null || input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vazio. Retornando ao menu.");
            return;
        } else{
            correnteDTO.setDeposito(Double.parseDouble(input));
            JOptionPane.showMessageDialog(null, correnteCTR.deposito());
        }
        
        principalVIEW.menu(clienteDTO, contaDTO);
    }
    
    public void sacar(){
        String input = JOptionPane.showInputDialog("Informe o valor do saque na conta corrente: ");
        
        if (input == null || input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vazio. Retornando ao menu.");
            return;
        } else{
            correnteDTO.setDeposito(Double.parseDouble(input));
            JOptionPane.showMessageDialog(null, correnteCTR.saque());
        }
    }
}