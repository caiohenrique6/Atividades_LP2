/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividadequestão;

/**
 *
 * @author ckaio
 */
public class Main {
    public static void main(String[] args){
        Avaliacao ava1 = new Avaliacao("Prova1");
        
        ava1.adicionarQuestao("Questao 1", 1.5);
        ava1.adicionarQuestao("Questao 2", 2.0);
        ava1.adicionarQuestao("Questao 3", 1);
        ava1.listarQuestoes();
        ava1.removerQuestao("Questao 3");
        ava1.listarQuestoes();
        ava1.calcularValor();
    }
}
