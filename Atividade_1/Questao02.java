package Atividade_1;
import java.util.Scanner;
/**
 *
 * @author ckaio
 */

/*
*Construa um algoritmo utilizando a representação de fluxograma que calcule e informe a
quantidade de gasolina que será preciso colocar no carro e quanto irá custar para o seu dono ir
até a sua fazenda. O usuário deverá informar a distância que será percorrida e o preço do litro
da gasolina. Para o cálculo, sabe-se que o carro faz em média 12 km/litro.
*/
public class Questao02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a distancia em KM e o preço da gasolina atualmente");
        double distancia = teclado.nextDouble();
        double valor = teclado.nextDouble();
        double qnt_litros = distancia/12;
        double custo = qnt_litros * valor;


        System.out.println("Gastara " + qnt_litros + "litros, que custara: R$ " + custo );
    }
}
