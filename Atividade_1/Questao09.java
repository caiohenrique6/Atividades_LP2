package Atividade_1;
import java.util.Scanner;
/**
 *Faça um algoritmo utilizando a representação de fluxograma que calcule o salário líquido
de um professor. Para elaborar o programa, é necessário solicitar do usuário alguns dados,
tais como valor da hora aula, número de horas trabalhadas no mês, percentual de desconto do
INSS. Em primeiro, deve-se estabelecer o seu salário bruto para fazer o desconto e ter o valor
do salário líquido.

 * @author ckaio
 */
public class Questao09 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o valor da hora aula, as horas trabalhadas e o percentual do INSS");
        
        double valor_h =teclado.nextDouble();
        double horas_trab = teclado.nextDouble();
        double inss = teclado.nextDouble();
        
        double p_bruto = valor_h * horas_trab;
        double desconto = p_bruto * (inss/100);
        double p_liquido = p_bruto - desconto;
        
        System.out.println("Seu pagamento liquido é R$" + p_liquido);
    }
}
