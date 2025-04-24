/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Banco2.DAO;

import com.Banco2.DTO.PoupancaDTO;

public class PoupancaDAO {
    public boolean saque(PoupancaDTO poupancaDTO){
        double novo_saldo;
        
        try{
            novo_saldo = poupancaDTO.getValor_pp() - poupancaDTO.getSaque();
        
            poupancaDTO.setValor_pp(novo_saldo);
            return true;
        } catch(Exception e0) {
            return false;
        }
        
    }
    
    public boolean deposito(PoupancaDTO poupancaDTO){
        double novo_saldo;
        
        try{
            novo_saldo = poupancaDTO.getValor_pp() + poupancaDTO.getDeposito();
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
