/*
 * A senha de um cofre é 1031. Esse é um programa que recebe um número do usuário
 * e informa a ele se o número digitado corresponde a senha ou não. Caso o número
 * não seja a senha, o programa dará uma dica, informando se a senha correta é 
 * maior ou menor que número digitado. 
 */
package logica.java;
import java.util.Scanner;

public class Senha {

public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       
        //Loop de solicitação da senha
        char tentativa = 'S';
        
        while(tentativa=='S' || tentativa=='s'){
            System.out.print("Para abrir este cofre, digite uma senha com 4 dígitos: ");
        int senha = input.nextInt();
        
        //Verificação se a senha está correta 
        if (senha == 1031){
            System.out.println("Parabéns, sua senha está correta!");
            break;
        }
        
        //Dica para senha digitada errôneamente
        else if (senha<1031){
            System.out.println("Você errou! A senha correta é maior que o número digitado.");
        }
        else {
            System.out.println("Você errou! A senha correta é menor que o número digitado.");
        }
            
        //Perguntando se quer tentar novamente após errar a senha
        System.out.print("Deseja tentar novamente? Digite S para sim e N para não: ");
        tentativa = input.next().charAt(0);
            
            if (tentativa=='N' || tentativa=='n'){
                System.out.println("Operação finalizada com sucesso.");
            }
        }
    }
}   

