/*
 * Programa que recebe dois números e indica se a soma deles é par ou ímpar.
 */
package logica.java;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Recebendo os números inteiros
        System.out.print("Digite um número inteiro: ");
        int n1 = input.nextInt();
        
        System.out.print("Digite outro número inteiro: ");
        int n2 = input.nextInt();
        
        //Calculando a soma
        int soma = n1 + n2;
        
        //Definindo se a soma é par ou ímpar
        if(soma%2==0){
            System.out.println("A soma desses números é par.");
        }
        else{
            System.out.println("A soma desses números é ímpar.");
        }
    }    
}
