/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade03;

/**
 *
 * @author ckaio
 */
public class Carro {

    private String modelo;
    private double velocidade;
    private double aceleracao;
    private int marcha;
    private boolean ligado = false;
    
    
    public Carro(String modelo,double velocidade,double aceleracao, int marcha, boolean ligado){
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.marcha = marcha;
        this.ligado = ligado;
    
    }
    
    
    
    public void ligar(){
        if(this.ligado == false){
            this.ligado = true;
            System.out.println("Carro ligado");
        } else {
            System.out.println("Carro ja esta ligado");
        }
    }
    
    public void desligar(){
        if(this.ligado == true){
            this.ligado = false;
            System.out.println("Carro desligado");
        } else {
            System.out.println("Carro ja esta desligado");}
    }
    
    
    
    public void acelerar(){
        if(this.ligado == true){
            this.velocidade += this.aceleracao;
        } else {
            System.out.println("Carro desligado não pode acelerar");
        }
    }
    
    public void desacelerar(){
        if(this.ligado == true){
            this.velocidade -= this.aceleracao;
        }else {
            System.out.println("Carro desligado não pode desacelerar");
        }
    }
    
    public void virar_direita(){
        System.out.println("Indo a direita");
    }
    
    public void virar_esquerda(){
        System.out.println("Indo a esquerda");
    }
    
    public void up_marcha(){
        if(this.marcha < 6){
            this.marcha += 1;
            System.out.println("Marcha esta no: " + this.marcha);
        
        }else{
            System.out.println("Marcha ja no maximo");
        }
       
    }
    
    public void down_marcha(){
        if(this.marcha>0){
            this.marcha -=1;
            System.out.println("Marcha esta no: "+ this.marcha);
        }else{
            System.out.println("Marcha ja no minimo");
        }
        
    }
    
    
    
    
    
    
}
