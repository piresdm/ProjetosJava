/*
 * Programa que recebe 3 números inteiros e diz qual o maior valor digitado.
 */
package logica.java;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     
    //Recebendo os números inteiros
     System.out.println("Você irá digitar 3 números inteiros e esse programa lhe dirá qual foi o maior valor digitado.");
     System.out.print("Digite o primeiro número: ");
     int n1 = input.nextInt();
     
     System.out.print("Digite o segundo número: ");
     int n2 = input.nextInt();
     
     System.out.print("Digite o terceiro número: ");
     int n3 = input.nextInt();
    
    //Definindo qual o maior valor     
     if (n1>=n2 && n1>=n3){
         System.out.println("O maior valor digitado foi "+n1);
     }
     else if (n2>=n1 && n2>=n3){
         System.out.println("O maior valor digitado foi "+n2);
     }  
     else if (n3>=n2 && n3>=n1){
         System.out.println("O maior valor digitado foi "+n3);
     }
    }    
}
