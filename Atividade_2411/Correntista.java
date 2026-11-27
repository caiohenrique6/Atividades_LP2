/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade24dos11;

/**
 *
 * @author ckaio
 */
public class Correntista {
    private String nome;
    private ContaCorrente conta;
    
    public Correntista(String nome){
        this.nome = nome;
        this.conta = new ContaCorrente();
    }
    
    public String getNome(){
        return nome;
    }
    
    public ContaCorrente getContaCorrente(){
        return conta;
    }
    
}
