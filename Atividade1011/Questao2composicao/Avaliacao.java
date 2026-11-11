/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividadequestão;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author ckaio
 */
public class Avaliacao {
    private String titulo;
    private double valor;
    List<Questao> listaQuestoes = new ArrayList<>();
    
    public Avaliacao(String titulo){
        this.titulo = titulo;
    }
    
    public void adicionarQuestao(String enunciado, double valor){
        Questao quest = new Questao(enunciado,valor);
        listaQuestoes.add(quest);
    }
    
    public void removerQuestao(String enunciado){
        for(Questao i: listaQuestoes){
            if(enunciado.equals(i.getEnunciado())){
                listaQuestoes.remove(i);
                break; 
            }
        }
    }
    
    
    public void listarQuestoes(){
        System.out.println(this.titulo);
        for(Questao i: listaQuestoes){
            System.out.println(i.getEnunciado() + "Valor: " + i.getPontuacao());
        }
    
    }
   
    public void calcularValor(){
        for(Questao i: listaQuestoes){
           valor += i.getPontuacao();
        }
        System.out.println(valor);
        
    }
    
    public double getValor(){
        return this.valor;
    }
    
}

