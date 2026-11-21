/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author ckaio
 */
public class Main {
    public static void main(String[] args){
        Loja loja1 = new Loja("Barbosa","tecidos",1999,"Luciano", 27);
        loja1.admitirVendedor("Caio", 19);
        loja1.demitirVendedor();
    
    
    }
    
}
