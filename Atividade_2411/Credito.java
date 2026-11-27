/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade24dos11;

/**
 *
 * @author ckaio
 */
public class Credito extends Operacao {
    
    @Override
    public double operar(double valor){
        if(valor < 0){
            return valor * -1;
        }else{
            return valor;
        }
    }

    
    public Credito(double valor){
        this.valor =+ operar(valor);
    
    }
}
