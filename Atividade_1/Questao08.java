
package Atividade_1;
import java.util.Scanner;

/**
 * Faça um algoritmo utilizando a representação de fluxograma que calcule a área de uma
circunferência e apresente a medida da área calculada. Sabe-se que para realizar o cálculo da
área de uma circunferência é necessário utilizar a seguinte a seguinte fórmula: A = Pi*r² . O
valor do Raio será informado pelo usuário.
 * @author ckaio
 */
public class Questao08 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o Raio: ");
        double raio = teclado.nextDouble();
        double area = 3.14 * (raio *raio);
        
        System.out.println("A Area é "+ area);
    }
}
