/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ckaio
 */
public class Loja {
    private String nome;
    private String ramo;
    private int ano_fundacao;
    private Vendedor vendedor;
    
    
    public Loja(String nome, String ramo,int ano, String nome_vendedor, int idade_vendedor){
      this.ano_fundacao = ano;
      this.nome = nome;
      this.ramo = ramo;
      this.vendedor = new Vendedor(idade_vendedor, nome_vendedor);
    
    }
    
    public String getNome(){
        return this.nome;
    }    
    
    public String getRamo(){
        return this.ramo;
    }

    public int getAnoFundacao(){
        return this.ano_fundacao;
    }
    
    public Vendedor getVendedor() {
        return vendedor;
    }
    
    public void setAnoFundacao(int ano){
        this.ano_fundacao = ano;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setRamo(String ramo){
        this.ramo = ramo;
    }
    

    public void admitirVendedor(String nome,int idade){
        this.vendedor = new Vendedor(idade, nome);
    }
    
    public void demitirVendedor(){
        this.vendedor = null;
    }
    
    
    
}
