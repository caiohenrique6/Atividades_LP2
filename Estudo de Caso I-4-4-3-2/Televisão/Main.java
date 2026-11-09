/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Televisao;

/**
 *
 * @author ckaio
 */
public class Main {
    public static void main(String[] args){
        Televisao tv1 = new Televisao(23,5,"lg",220,0);
        tv1.ligar();
        tv1.aumentar_canal();
        tv1.aumentar_volume();
        tv1.desligada();
    
    
    }
}
