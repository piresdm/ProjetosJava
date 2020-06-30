/*
 * Programa para calcular a área de uma das seguintes figuras geométricas
 * a ser escolhida pelo usuário: quadrado, triângulo ou círculo.
 */
package logica.java;

import java.util.Scanner;

public class AreasFiguras {
    public static void main (String[] args){
     Scanner input = new Scanner(System.in);
     
     //Loop para definir se o usuário deseja continuar calculando
     char tentativa = 'S';
     while(tentativa == 'S' || tentativa == 's'){
     
     //Menu para o usuário escolher qual área deseja calcular
     System.out.print("Qual figura você quer saber a área? Digite 1 para quadrado, 2 para triângulo e 3 para círculo: ");
     int figura = input.nextInt();
     
     //Cálculo da área escolhida pelo usuário
     switch(figura){
         case 1: System.out.print("Digite o tamanho do lado do quadrado: ");
         float lado = input.nextFloat();
         float areaQuadrado = lado * lado;
         System.out.printf("A área do quadrado é: %.2f\n",areaQuadrado);
         break;
     
         case 2: System.out.print("Digite o tamanho da base do triângulo: ");
             float base = input.nextFloat();
             System.out.print("Digite o tamanho da altura do triângulo: ");
             float altura = input.nextFloat();
             float areaTriangulo = (base*altura)/2;
             System.out.printf("A área do triângulo é: %.2f\n",areaTriangulo);
             break;
         
         case 3: System.out.print("Digite o raio do círculo: ");
            float raio = input.nextFloat();
            double areaCirculo = Math.PI*raio*raio;
             System.out.printf("A área do círculo é %.2f\n: ",areaCirculo);
             break;
         
         default: System.out.println("O número digitado é inválido.");
                  System.out.println("Você deve digitar 1 para quadrado, 2 para triângulo ou 3 para círculo.");
        }
         System.out.println("Deseja calcular a área de outra figura? Se sim, digite S, se não, digite N: ");
         tentativa = input.next().charAt(0);
         
         if(tentativa=='N' || tentativa=='n' ){
             System.out.println("Operação encerrada com sucesso!");
         }
     }
     
 }   
}
