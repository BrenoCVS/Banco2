/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Banco2.VIEW;

import com.Banco2.DTO.CorrenteDTO;
import javax.swing.JOptionPane;

public class CorrenteVIEW extends ContaVIEW{

    CorrenteDTO correnteDTO = new CorrenteDTO();

    public void valor_cc (){
        correnteDTO.setValor_cc(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta corrente: ")));
    }
    
    public void desconto(){
        correnteDTO.setRetirada(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da retirada na conta corrente: ")));
    }
    
    public void deposito(){
        correnteDTO.setDeposito(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do deposito na conta corrente: ")));
    }
}