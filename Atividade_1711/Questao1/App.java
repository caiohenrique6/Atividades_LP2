/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade17dos11;

/**
 *
 * @author ckaio
 */
public class App {
    
    
    
    public static void main(String[] args){
        Brinquedo brinquedo1 = new Navio();
        Brinquedo brinquedo2 = new Helicoptero();
        Brinquedo brinquedo3 = new Caminhao();
        
        
        Controle controle1 = new Controle(brinquedo1);
        Controle controle2 = new Controle(brinquedo2);
        Controle controle3 = new Controle(brinquedo3);
        
        controle1.mover();
        controle2.mover();
        controle3.mover();
       
        
    }
    
}
