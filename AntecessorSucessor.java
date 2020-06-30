/*
 * Programa que recebe um número inteiro e imprime seu sucessor e antecessor, 
 * utilizando apenas uma variável
*/
package logica.java;
import java.util.Scanner;

public class AntecessorSucessor {
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Solicitação do número inteiro ao usuário
        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();
        
        // Impressão do antecessor e do sucessor
        System.out.println("O antecessor e o sucessor de "+num+ " são, respectivamente: " + (num-1) +" e "+ (num+1));
        
   }
}


