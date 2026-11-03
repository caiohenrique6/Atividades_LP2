package Atividade_1;
import java.util.Scanner;
/**
 *Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário dois
valores numéricos. Em seguida o algoritmo deverá efetuar a soma dos dois valores e caso o
resultado seja maior ou igual a 10, deve-se ser somado a 5 caso contrário o valor do resultado
deverá ser subtraído de 7. Após a obtenção do resultado apresente essa informação para o
usuário.
 * @author ckaio
 */
public class Questao11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe dois numeros");
        
        double valor1 = teclado.nextDouble();
        double valor2 = teclado.nextDouble();
        double soma = valor1 + valor2;
        
        if( soma >= 10){
            double resultado = soma + 5;
            System.out.println("O resultado é " + resultado);
        }else {
            double resultado = soma - 7;
            System.out.println("O resultado é " + resultado);
            
        }
    
    }
}
