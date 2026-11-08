/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pacote.atividade02;

/**
 *
 * @author ckaio
 */
public class Calculo {
        
    private double totalSalario;
    
    
    public double calculaSalario(double salariobase, double horastrabalhadas){
        this.totalSalario = salariobase * horastrabalhadas;
        return totalSalario;
    
    }
    
    public double getTotalSalario(){
        return totalSalario;
    }
    
    
}
