/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade24dos11;

/**
 *
 * @author ckaio
 */
public class Debito extends Operacao{
    
    @Override
    public double operar(double valor){
        valor = valor * -1;
        return valor;
    }
    
    public Debito(double valor){
        this.valor = operar(valor);
    
    }
    
}
