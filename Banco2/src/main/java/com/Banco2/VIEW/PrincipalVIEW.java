/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Banco2.VIEW;

import com.Banco2.DTO.ContaDTO;
import com.Banco2.DTO.ClienteDTO;
import com.Banco2.VIEW.ClienteVIEW;
import com.Banco2.VIEW.PoupancaVIEW;
import com.Banco2.VIEW.CorrenteVIEW;
import javax.swing.JOptionPane;
import com.Banco2.DTO.PoupancaDTO;
import com.Banco2.DTO.CorrenteDTO;

public class PrincipalVIEW {
        
    public static void menu(ClienteDTO clienteDTO, ContaDTO contaDTO) {

        PoupancaVIEW poupancaVIEW = new PoupancaVIEW();
        CorrenteVIEW correnteVIEW = new CorrenteVIEW();
        ClienteVIEW clienteVIEW = new ClienteVIEW();
        PoupancaDTO poupancaDTO = new PoupancaDTO();
        CorrenteDTO correnteDTO = new CorrenteDTO();

        int opcao = 1;
       

        do {
            if(opcao != 0){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Olá " + clienteDTO.getNome_cliente() + ", tudo bem?"
                    + "\nEscolha uma opção para realizar operações no Banco: " + contaDTO.getNome_banco()
                    + "\n1 - Realizar Depósito na Poupança."
                    + "\n2 - Realizar Depósito na Conta Corrente."
                    + "\n3 - Realizar Saque na Poupança."
                    + "\n4 - Realizar Saque na Conta Corrente."
                    + "\n5 - Ver saldo das contas."
                    + "\n0 - Fechar o Sistema."));

            switch (opcao) {
                case 1:
                    poupancaVIEW.deposito();
                    break;
                case 2:
                    correnteVIEW.deposito();
                    break;
                case 3:
                    poupancaVIEW.sacar();
                    break;
                case 4:
                    correnteVIEW.sacar();
                    break;
                case 5:
                    clienteVIEW.saldo(correnteDTO, poupancaDTO);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Sistema Encerrado!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
                    break;
            }
            }

        } while (opcao != 0);
    }

}
