/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade17dos11;

/**
 *
 * @author ckaio
 */
public class Controle {
    private Brinquedo brinquedo;
    
    public Controle(Brinquedo brinquedo){
        this.brinquedo = brinquedo;
    }
    
    public void mover(){
        this.brinquedo.mover();
    }

}
