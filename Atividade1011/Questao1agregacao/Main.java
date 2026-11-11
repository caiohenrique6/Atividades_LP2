/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadesala10dos11;

/**
 *
 * @author ckaio
 */
public class Main {
    

    public static void main(String[] args) {
        Curso curso1 = new Curso("lp1");
        Professor pro1 = new Professor("Cleber","Programação");
        Professor pro2 = new Professor("Osnildo","Matematica");
        Professor pro3 = new Professor("Just","Programação");
        
        curso1.adicionarProfessor(pro1);
        curso1.adicionarProfessor(pro2);
        curso1.adicionarProfessor(pro3);
        curso1.listarProfessor();
        curso1.removerProfessor("Osnildo");
        curso1.listarProfessor();
    }
}
