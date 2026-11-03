package Atividade_1;
import java.util.Scanner;
/**
 *Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário sua
idade e informe se o mesmo já pode tirar carteira de motorista. O usuário somente poderá
tirar a carteira de motorista se a idade for maior que 18 anos.
 * @author ckaio
 */
public class Questao03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a sua idade: ");
        int idade = teclado.nextInt();
        
        if(idade < 18) {
            System.out.println("não pode fazer  a CNH");
        } else {
            System.out.println("Tem idade suficiente para tirar a CNH");
            
        }}
}
