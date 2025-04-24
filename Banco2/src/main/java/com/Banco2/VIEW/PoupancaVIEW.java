/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Banco2.VIEW;
import com.Banco2.DTO.PoupancaDTO;
import javax.swing.JOptionPane;

public class PoupancaVIEW extends ContaVIEW{

    PoupancaDTO poupancaDTO = new PoupancaDTO();

    public void valor_pp (){
        poupancaDTO.setValor_pp(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da poupança: ")));
    }
}
