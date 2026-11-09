/*w
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Televisao;

/**
 *
 * @author ckaio
 */
public class Televisao {
    
    private double tamanho;
    private int volume = 5;
    private String marca;
    private int voltagem;
    private int canal;
    private boolean ligado;
    
    public Televisao(double tamanho, int volume, String marca, int voltagem, int canal){
        this.canal = canal;
        this.marca = marca;
        this.tamanho = tamanho;
        if((voltagem == 220) || (voltagem == 110)){
            this.voltagem = voltagem;
        } else {
            this.voltagem = 110;
        }
        this.volume = volume;
    }
    
    public void ligar(){
        if(this.ligado == false){
            this.ligado = true;
            System.out.println("O consumo da televisão é "+ (voltagem *tamanho));
        }else {
            System.out.println("Ja esta ligado");
        }
           
    
    }
    
    public void desligada() {
        if(this.ligado == true){
            this.ligado = false;
            System.out.println("Desligado");
        }else{
            System.out.println("Desligado");
        }
    }
    
    
    public void aumentar_volume(){
        if(this.volume < 10){
            this.volume += 1;
            System.out.println("Canal"+volume);
        }else{
            System.out.println("Ja esta no maximo");
        }
    }
        
    public void menor_volume(){
        if(this.volume > 0){
            this.volume -= 1;
            System.out.println("Canal"+volume);
        } else{
            System.out.println("Ja esta no minimo");
        }
    }
    
   
    public void aumentar_canal() {    
        this.canal += 1;
    }
    
    public void menor_canal() {
        this.canal -=1;
    }
    
    
}
