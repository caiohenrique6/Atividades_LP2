/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadesala10dos11;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author ckaio
 */
public class Curso {
    private String nome_curso;
    List<Professor> listaProfessores = new ArrayList<>();
    
    public Curso(String nome){
        this.nome_curso = nome;
    }
    
    public void adicionarProfessor(Professor prof){
        listaProfessores.add(prof);
    }
    
    public void listarProfessor(){
        System.out.println("Professores: ");
        for(Professor i: listaProfessores){
            System.out.println(i.nome);
        }
    }
   
    public void removerProfessor(String nome){
        for(Professor i: listaProfessores) {
            if(nome.equals(i.nome)){
                listaProfessores.remove(i);
                return ;}
        }
        
        System.out.println("Professor não encontrado");
      
            
        
    
    }
}