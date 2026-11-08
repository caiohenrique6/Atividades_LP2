package Atividade_1;

import java.util.Scanner;

/**
 *Faça um algoritmo utilizando a representação de fluxograma para ler a temperatura do
corpo medida com um termômetro. Caso a temperatura seja maior que 37 graus o paciente
está com febre, caso contrário, sua temperatura está normal. Após ler a temperatura mostre a
mensagem apropriada.

 * @author ckaio
 */
public class Questao04 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a sua temperatura atual:  ");
        float temp = teclado.nextFloat();
        
        if(temp < 37) {
            System.out.println("Esta com temp normal");
        } else {
            System.out.println("Esta com febre");
            
        }
    }
}

