package Atividade_1;
import java.util.Scanner;
/**
 *Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário as
notas de 2 provas e um trabalho e que seja capaz de calcular a média aritmética. Caso a média
final seja maior ou igual a 7 mostre a mensagem “aprovado”, caso contrario, imprimir a
mensagem reprovado”.

 * @author ckaio
 */
public class Questao06 {
    public static void mai(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Me fale as notas das provas e do trabalho: ");
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextFloat();
        
        double media = ((nota1+nota2+nota3)/3);
        
        if (media < 7){
            System.out.println("Reprovado");
        }else {
            System.out.println("Aprovado");
        }
                
    }
    
}
