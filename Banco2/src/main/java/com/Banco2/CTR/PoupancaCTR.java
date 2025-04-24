/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Banco2.CTR;

import com.Banco2.DAO.PoupancaDAO;
import com.Banco2.DTO.PoupancaDTO;

public class PoupancaCTR {
    
    PoupancaDAO poupancaDAO = new PoupancaDAO();    
    PoupancaDTO poupancaDTO = new PoupancaDTO();

    public String saque(){
        
        if(poupancaDAO.saque(poupancaDTO)){
            return "Saque realizafo com sucesso!";
        } else{
            return "Erro ao realizar saque";
        }
    }
    
    public String deposito(){
        
        if(poupancaDAO.deposito(poupancaDTO)){
            return "Deposito realizado com sucesso!";
        } else {
            return "Erro ao realizar deposito";
        }
    }
}
