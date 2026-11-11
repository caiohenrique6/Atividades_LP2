/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividadequestão;

/**
 *
 * @author ckaio
 */
public class Questao {
    private String enunciado;
    private double pontuacao;
    
    public Questao(String enunciado, double pontuacao){
        this.enunciado = enunciado;
        this.pontuacao = pontuacao;
    }
    
    public String getEnunciado(){
        return this.enunciado;
    }
    public double getPontuacao(){
        return this.pontuacao;
    }
}
