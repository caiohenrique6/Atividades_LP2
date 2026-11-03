package Atividade_1;
import java.util.Scanner;
/**
 *Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário 2
números diferentes e mostre o maior deles.

 * @author ckaio
 */
public class Questao05 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe dois numeros");
        
        double numero1 = teclado.nextDouble();
        double numero2 = teclado.nextDouble();
        
        if (numero1>numero2){
            System.out.println(numero1 + "é o maior");
        }else{
            System.out.println(numero2 + "é o maior");
        }
       
       
       
    }
    
}
