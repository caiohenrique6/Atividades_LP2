/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade24dos11;

/**
 *
 * @author ckaio
 */
public class App {

    public static void main(String[] args) {
        Banco caixa = new Banco("Ana", "jose","Amanda");
        
        caixa.creditar("Amanda", 800000);
        caixa.debitar("Ana", 150);
        caixa.debitar("jose", 6000);
        
        System.out.println("Saldo de Amanda : " + caixa.getSaldo("Amanda"));
        System.out.println("Saldo de Ana : " + caixa.getSaldo("Ana"));
        caixa.transferir("Amanda", "Ana", 200);
        System.out.println("Saldo de Amanda : " + caixa.getSaldo("Amanda"));
        System.out.println("Saldo de Ana : " + caixa.getSaldo("Ana"));
    }
}
