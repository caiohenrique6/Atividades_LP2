package Atividade_1;
import java.util.Scanner;

/**
 *
 * @author ckaio
 */

//1) Construir um algoritmo utilizando a representação de fluxograma para que solicite ao
//usuário a quantidade de horas trabalhadas no mês por um operário. Em seguida, calcular e
//informar o seu salário sabendo que ele ganha R$ 20,00 por hora


public class Questao01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite as horas trabalhadas");
        
        int horas = teclado.nextInt();
        float pagamento = horas * 20;
        
        System.out.println("Seu pagamento é de: R$" + pagamento);
    
    }
}
