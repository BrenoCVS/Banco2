/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Banco2.app;

import com.Banco2.VIEW.ClienteVIEW;
import com.Banco2.VIEW.ContaVIEW;
import com.Banco2.VIEW.PoupancaVIEW;
import com.Banco2.VIEW.CorrenteVIEW;
import com.Banco2.VIEW.PrincipalVIEW;
import com.Banco2.DTO.ClienteDTO;
import com.Banco2.DTO.ContaDTO;

import com.Banco2.DTO.CorrenteDTO;
import com.Banco2.DTO.PoupancaDTO;

public class Main {
    public static void main(String[] args){
        ClienteVIEW clienteVIEW = new ClienteVIEW();
        ContaVIEW contaVIEW = new ContaVIEW();
        PoupancaVIEW poupancaVIEW = new PoupancaVIEW();
        CorrenteVIEW correnteVIEW = new CorrenteVIEW();
        PrincipalVIEW principalVIEw = new PrincipalVIEW();
        ContaDTO contaDTO = new ContaDTO();
        ClienteDTO clienteDTO = new ClienteDTO();
        
        CorrenteDTO correnteDTO = new CorrenteDTO();
        PoupancaDTO poupancaDTO = new PoupancaDTO();

        clienteVIEW.nome_cliente(clienteDTO);
        contaVIEW.nome_banco();
        correnteVIEW.valor_cc(correnteDTO);
        poupancaVIEW.valor_pp(poupancaDTO);
        principalVIEw.menu(clienteDTO, contaDTO, correnteDTO, poupancaDTO);
        
    }
    
}
