/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Banco2.app;

import com.Banco2.VIEW.ClienteVIEW;
import com.Banco2.VIEW.ContaVIEW;
import com.Banco2.VIEW.PoupancaVIEW;
import com.Banco2.VIEW.CorrenteVIEW;

public class Main {
    public static void main(String[] args){
        ClienteVIEW clienteVIEW = new ClienteVIEW();
        ContaVIEW contaVIEW = new ContaVIEW();
        PoupancaVIEW poupancaVIEW = new PoupancaVIEW();
        CorrenteVIEW correnteVIEW = new CorrenteVIEW();

        clienteVIEW.nome_cliente();
        contaVIEW.nome_banco();
        correnteVIEW.valor_cc();
        poupancaVIEW.valor_pp();
        correnteVIEW.desconto();
        
    }
    
}
