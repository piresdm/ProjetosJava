/*
 * Programa que recebe 3 números inteiros e diz qual a ordem crescente dos números.
 */
package logica.java;
import java.util.Scanner;

public class OrdemNumeros {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Programa para ordenar números inteiros");
        
        //Recebendo os números inteiros
        System.out.print("Digite o primeiro número: ");
        int n1 = input.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int n2 = input.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        int n3 = input.nextInt();
        
        //Definindo a ordem crescente dos números
        if(n1>=n2 && n1>=n3 && n2>=n3){
            System.out.println("A ordem crescente dos números digitados é: "+n3+", "+n2+", "+n1);
        }
        else if (n1>=n2 && n1>=n3 && n2<=n3){
            System.out.println("A ordem crescente dos números digitados é: "+n2+", "+n3+", "+n1);
        }
        else if (n1<=n2 && n1<=n3 && n2>=n3){
            System.out.println("A ordem crescente dos números digitados é: "+n1+", "+n3+", "+n2);
        }
        else if (n1<=n2 && n1<=n3 && n2<=n3){
            System.out.println("A ordem crescente dos números digitados é: "+n1+", "+n2+", "+n3);
        }
        else if (n1<=n2 && n1>=n3 && n2>=n3){
            System.out.println("A ordem crescente dos números digitados é: "+n3+", "+n1+", "+n2);
        }
        else if (n1>=n2 && n1<=n3 && n2<=n3){
            System.out.println("A ordem crescente dos números digitados é: "+n2+", "+n1+", "+n3);
        }
    }
}
