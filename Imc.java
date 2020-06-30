/*
 * Programa que informa a situação do usuário com relação ao seu peso baseado
 * no índice de massa corporal (IMC)
 */
package logica.java;
import java.util.Scanner;

public class Imc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Receber os dados do usuário 
        System.out.print("Digite seu peso: ");
        float peso = input.nextFloat();
        
        System.out.print("Digite sua altura: ");
        float altura = input.nextFloat();
        
        //Cálculo do IMC
        double imc = peso/(altura*altura);
        
        // Resposta ao usuário
        if (imc<16){
            System.out.printf("Seu IMC é %.2f, você está com subpeso severo.\n",imc);
        }
        if (imc>16 && imc<19.9){
            System.out.printf("Seu IMC é %.2f, você está com subpeso.\n",imc);
        }
        if (imc>20 && imc<24.9){
            System.out.printf("Seu IMC é %.2f, você está no patamar ideal de peso.\n",imc);
        }
        if (imc>25 && imc<29.9){
            System.out.printf("Seu IMC é %.2f, você está com sobrepeso.\n",imc);
        }
        if (imc>30 && imc<39.9){
            System.out.printf("Seu IMC é %.2f, você está obeso.\n",imc);
        }
        if (imc>40){
            System.out.printf("Seu IMC é %.2f, você está com obesidade mórbida.\n",imc);
        }
    }    
}
