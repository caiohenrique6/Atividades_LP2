/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pacote.atividade02;

/**
 *
 * @author ckaio

*/


public class Funcionário {
    private static int geraMatricula = 0;
    
    public String nome;
    public String cpf;
    public String rg;
    private int matricula;
    private double salario_do_funcionario;
    private double salario_base;
    private double horas_trabalhadas;
    public String data_contrataçao;
    
    public Funcionário(double salario_base, String nome, double horas_trabalhadas, String data_contrataçao){
        this.nome = nome;
        geraMatricula = ++geraMatricula;
        this.matricula = geraMatricula;
        this.salario_base = salario_base;
        this.horas_trabalhadas = horas_trabalhadas;
        this.data_contrataçao = data_contrataçao;
           
    
    }
    
    public void calculaSalario(){
        Calculo c = new Calculo();
        this.salario_do_funcionario = c.calculaSalario(salario_base, horas_trabalhadas);
    }
    
    public void imprimeDados(){
        System.out.println("Nome: "+nome+"\nMatricula: "+matricula+"\nsalario base: "+salario_base+"\nHoras trabalhadas: "+horas_trabalhadas+"\nSalario final: "+salario_do_funcionario);
    }
   

}
