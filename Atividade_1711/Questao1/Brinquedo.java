/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade17dos11;

/**
 *
 * @author ckaio
 */
public class Brinquedo {
    protected double velocidade;
    protected double aceleracao;
    
    public Brinquedo(){
        this.velocidade = 0.0;
        this.aceleracao = 0.0;
    }
    
    public void Velocidade(int velocidade){
        this.velocidade= velocidade;
        
    }
    
    public void Velocidade(double velocidade){
        this.velocidade = velocidade;
    
    }
            
    public void Velocidade(double velocidade, double aceleracao){
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
    }
    
    
   public void mover(){
       System.out.println("Brinquedo se movendo");
   
   }
    
    
    
}
