/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Banco2.CTR;

import com.Banco2.DAO.CorrenteDAO;
import com.Banco2.DTO.CorrenteDTO;

public class CorrenteCTR {
    CorrenteDAO correnteDAO = new CorrenteDAO();
    CorrenteDTO correnteDTO = new CorrenteDTO();
    
    public String saque(){
        if(correnteDAO.sacar(correnteDTO)){
            return "Saque realizafo com sucesso!";
        } else{
            return "Erro ao realizar saque";
        }
    }
    
    public String deposito(){
        if(correnteDAO.depositar(correnteDTO)){
            return "deposito realizafo com sucesso!";
        } else{
            return "Erro ao realizar deposito";
        }
    }
}
