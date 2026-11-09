/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade03;

/**
 *
 * @author ckaio
 */
public class Main {
    public static void main(String[] args){
        Carro carro = new Carro ("mobi",0,15,0,false);
        carro.ligar();
        carro.acelerar();
        carro.up_marcha();
        carro.virar_direita();
        carro.virar_esquerda();
        carro.desacelerar();
        carro.down_marcha();
        carro.desligar();
    
    
    
    }
}
