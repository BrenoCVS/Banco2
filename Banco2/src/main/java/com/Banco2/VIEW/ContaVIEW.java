/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Banco2.VIEW;

import javax.swing.JOptionPane;
import com.Banco2.DTO.ContaDTO;

public class ContaVIEW {
    ContaDTO contaDTO = new ContaDTO();

    public void nome_banco(){
        contaDTO.setNome_banco(JOptionPane.showInputDialog("Insira o nome do seu banco: "));
    }
}
