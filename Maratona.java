/*
 * Programa que receba os tempos de 10 corredores de uma maratona e depois 
 * imprime o tempo médio da prova, considerando os 10 atletas, e o melhor e o 
 * pior tempo obtido. 
*/
package logica.java;

import java.util.Scanner;

public class Maratona {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
    
    //Declaração e inicialização de algumas variáveis
    float maior, menor, tempoMedio, tempo, soma;
    int contador = 1;
    soma=0;
     
    //Recebendo o tempo do primeiro atleta 
    System.out.print("Digite o tempo(h) gasto por um dos atletas para terminar a maratona: ");
    tempo = input.nextFloat();
    maior=tempo;
    menor=tempo;  
    
    //Loop para receber o tempo dos demais atletas e definir os resultados
    for (contador = 1;contador <= 9;contador++){
        System.out.print("Digite o tempo(h) gasto por um dos atletas para terminar a maratona: ");
        tempo = input.nextFloat();
        soma = soma + tempo;
                
        if(tempo<menor){
            menor = tempo;
        }
        if(tempo>maior){
            maior = tempo;
        }
        }
        tempoMedio= soma/10;
        
        //Impressão dos resultados para o usuário
        System.out.printf("O tempo médio gasto pelos participantes da corrida foi: %.2f \n",tempoMedio);
        System.out.println("O maior tempo foi: "+maior);
        System.out.println("O menor tempo foi: "+menor);
    }
}
