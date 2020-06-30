
//Programa que diz se o número é primo ou não

package logica.java;
import java.util.Scanner;

public class NumeroPrimo {
  public static void main (String[] args){
    Scanner input= new Scanner(System.in);
     
    int divisores = 0;
     
     //Recebendo o número escolhido pelo usuário 
    System.out.print("Digite um número inteiro para saber se ele é primo: ");
    int numeroPrimo = input.nextInt(); 
    
    //Loop para definir se o número é primo ou não
    for(int i = 1; i <= numeroPrimo; i++){
        if(numeroPrimo % i == 0){
        divisores++;
        }
    }
    //Mostrando o resultado ao usuário
    if(divisores == 2){
        System.out.println("Esse número é primo.");
    }else{
        System.out.println("Esse número não é primo.");
    }
 }
}  

