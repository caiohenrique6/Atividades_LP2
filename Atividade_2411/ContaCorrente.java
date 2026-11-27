/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade24dos11;

/**
 *
 * @author ckaio
 */
public class ContaCorrente {
    private double valor = 0.0;
    
    public void executarOperacao(Operacao opr){
        this.valor = valor + opr.valor;
    }
    
    public double getSaldo(){
        return valor;
    }
}
