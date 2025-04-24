/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Banco2.DTO;

public class CorrenteDTO{

    private double valor_cc, retirada, deposito;

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
    

    public double getRetirada() {
        return retirada;
    }

    public void setRetirada(double retirada) {
        this.retirada = retirada;
    }

    public double getValor_cc(){
        return valor_cc;
    }

    public void setValor_cc(double valor_cc){
        this.valor_cc = valor_cc;
    }
}