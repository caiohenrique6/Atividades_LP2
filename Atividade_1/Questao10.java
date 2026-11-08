
package Atividade_1;
import java.util.Scanner;

/**Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário dois
valores numéricos. Em seguida o algoritmo deverá efetuar a soma dos dois valores e
apresentar o resultado caso seja maior que 10.
 *
 * @author ckaio
 */
public class Questao10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe 2 valores: ");
        
        double valor1 = teclado.nextDouble();
        double valor2 = teclado.nextDouble();
        
        double soma = valor1 + valor2;
        
        if(soma > 10) {
            System.out.println("A Soma dos valores é: " + soma);
        }else {
            System.out.println("A soma não é maior que 10");
        }
}}
