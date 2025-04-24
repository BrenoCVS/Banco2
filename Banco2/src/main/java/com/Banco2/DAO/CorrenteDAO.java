/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Banco2.DAO;

import com.Banco2.DTO.CorrenteDTO;

public class CorrenteDAO {
                
    public boolean sacar(CorrenteDTO correnteDTO){
        double novo_saldo;
        
        try{
            
            novo_saldo = correnteDTO.getValor_cc() - correnteDTO.getRetirada();
        
            correnteDTO.setValor_cc(novo_saldo);
            return true;
            
        } catch ( Exception e){
            return false;
        }
    }
    
    public boolean depositar(CorrenteDTO correnteDTO){
        double novo_valor;
        
        try{
            
            novo_valor = correnteDTO.getValor_cc() + correnteDTO.getRetirada();
            correnteDTO.setValor_cc(novo_valor);
            return true;
            
        } catch ( Exception e){
            return false;
        }
    }
}
