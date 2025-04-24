/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Banco2.DTO;

public class PoupancaDTO extends ContaDTO {
    private double valor_pp, retirada, deposito, saque;

    public double getRetirada() {
        return retirada;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public void setRetirada(double retirada) {
        this.retirada = retirada;
    }
    

    public double getValor_pp(){
        return valor_pp;
    }

    public void setValor_pp(double valor_pp){
        this.valor_pp = valor_pp;
    }
}
