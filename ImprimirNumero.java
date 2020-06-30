
// Programas para imprimir todos os números até o escolhido pelo usuário

package logica.java;

import java.util.Scanner;

public class ImprimirNumero {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Recebendo o número escolhido pelo usuário
        System.out.print("Digite o número até o qual você deseja imprimir: ");
        int numero = input.nextInt();
        
        int contador = 1;
        
        //Imprimindo os números
        while(numero>=contador){
            System.out.println(contador);
            contador ++;
        }
    }    
}
