/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade3_2;

/**
 *
 * @author ckaio
 */
public class Programa {

    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00, 10);
        Produto p2 = new Produto("Mouse Sem Fio", 80.00, 25);
        Produto p3 = new Produto("Teclado Mecânico", 250.00, 15);
        
        System.out.println("Estoque " + p1.getNome() + ": R$ " + p1.calcularValorEstoque());
        System.out.println("Estoque " + p2.getNome() + ": R$ " + p2.calcularValorEstoque());
        System.out.println("Estoque " + p3.getNome() + ": R$ " + p3.calcularValorEstoque());      
        
        double valorTotalGeral = p1.calcularValorEstoque() + p2.calcularValorEstoque() + p3.calcularValorEstoque();
        System.out.println("Valor Total Geral do Estoque: R$ " + valorTotalGeral);       
        System.out.println("Total registrado pela classe: " + Produto.getTotalProdutosCriados());
        
        
    }
}
