
package Atividade_1;
import java.util.Scanner;
/**
 *Faça um algoritmo utilizando a representação de fluxograma que leia o peso e a altura do
usuário e informa se o mesmo está obeso. Lembre que para saber se uma pessoa está obesa
deve-se utilizar a fórmula: imc = peso/altura2. Caso o resultado do imc seja maior que 30 o
usuário está obeso.
 * @author ckaio
 */
public class Questao07 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
		
    System.out.println("Informe seu peso e altura");
    double peso = teclado.nextDouble();
    double altura = teclado.nextDouble();
    double imc = peso / (altura*altura);
		
    if (imc > 30){
        System.out.println("Você está obeso");
    } else{
        System.out.println("Você não está obeso");
        }    
}
}
