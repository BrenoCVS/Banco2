/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Banco2.VIEW;

import javax.swing.JOptionPane;
import com.Banco2.DTO.ClienteDTO;

public class ClienteVIEW {

    ClienteDTO clienteDTO = new ClienteDTO();

    public void nome_cliente(){
        clienteDTO.setNome_cliente(JOptionPane.showInputDialog("Qual o nome do cliente: "));
    }
}
