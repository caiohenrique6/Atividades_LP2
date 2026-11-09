/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Pacote.atividade02;

/**
 *
 * @author ckaio
 */
public class Main {
      
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Funcionário f = new Funcionário(1985.79,"Caio",7.50,"16/09");
        Funcionário c = new Funcionário(1985.79,"enzo",7.50,"16/09");
        f.calculaSalario();
        c.calculaSalario();
        f.imprimeDados();
        c.imprimeDados();
    }
}
