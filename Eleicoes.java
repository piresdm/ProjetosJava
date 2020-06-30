
//Programa para realizar a contagem de votos na eleição entre 3 candidatos.
 
package logica.java;
import java.util.Scanner;

public class Eleicoes {
     public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        //Inicialização das variáveis
        double joao=0;
        double maria=0;
        double marcelo=0;
        char tentativa = 'S';
        double totalVotos = 0;
        double percentualJoao;
        double percentualMaria;
        double percentualMarcelo;
        
        
        System.out.println("Começou a eleição!");
        
        //Loop para definir se vai incluir novo voto ou não
        while(tentativa == 'S' || tentativa=='s'){
        
        //Recebendo o voto
        System.out.print("Digite 1 para votar em João, 2 para Maria e 3 para Marcelo: ");
        int voto = input.nextInt();
        
        //Computando o voto
        switch (voto){
            case 1: 
                joao++;
                totalVotos++;
                System.out.println("Seu voto em João foi computado com sucesso!");
                break;
                
            case 2: 
                maria++;
                totalVotos++;
                System.out.println("Seu voto em Maria foi computado com sucesso!");
                break;
                
            case 3: 
                marcelo++;
                totalVotos++;
                System.out.println("Seu voto em Marcelo foi computado com sucesso!");
                break;
            
            default: System.out.println("Você digitou um número inválido!");
        }
            System.out.println("Você deseja votar novamente? ");
            tentativa = input.next().charAt(0);
        
            if (tentativa=='N' || tentativa=='n'){
                System.out.println("Votação encerrada!");
            }
        }
        
        //Calculando o percentual de voto de cada canditato
        percentualJoao = (joao/totalVotos)*100;
        percentualMaria = (maria/totalVotos)*100;
        percentualMarcelo = (marcelo/totalVotos)*100;
        
        //Imprimindo o resultado para o usuário
        System.out.println("O resultado da eleição foi: ");
        System.out.println("João "+ percentualJoao+ "% dos votos");
        System.out.println("Maria "+ percentualMaria+ "% dos votos");
        System.out.println("Marcelo "+ percentualMarcelo+ "% dos votos");
            
        if(percentualJoao>50){
            System.out.println("João foi eleito no primeiro turno com "+percentualJoao+"% dos votos!");
        }
        else if(percentualMaria>50){
            System.out.println("Maria foi eleita no primeiro turno com "+percentualMaria+"% dos votos!");
        }
        else if(percentualMarcelo>50){
            System.out.println("Marcelo foi eleito no primeiro turno com "+percentualMarcelo+"% dos votos!");
        }
        else{
            System.out.println("Haverá segundo turno.");
        }
    }
}
