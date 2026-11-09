/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade3_2;

/**
 *
 * @author ckaio
 */
    
public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    private static int qnt_produtos = 0;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        setPreco(preco);
        setQuantidade(quantidade);
        Produto.qnt_produtos++; 
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço não pode ser negativo (" + preco + "). Definido para 0.0.");
            this.preco = 0.0;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Erro: A quantidade não pode ser menor que zero (" + quantidade + "). Definida para 0.");
            this.quantidade = 0;
        }
    }

    public double calcularValorEstoque() {
        return this.preco * this.quantidade;
    }

    public static int getTotalProdutosCriados() {
        return qnt_produtos;
    }
}
    
    
    
    

