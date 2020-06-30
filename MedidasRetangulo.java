/*
 * Programa que recebe a base e a altura de um retângulo para calcular
 * seu perímetro, área e diagonal.
 */
package logica.java;
import java.util.Scanner;


public class MedidasRetangulo {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      //Solicitação das informações
      System.out.print("Digite base do retângulo: ");
      float base = input.nextFloat();
      
      System.out.print("Digite a altura do retângulo: ");
      float altura = input.nextFloat();
      
      //Cálculos das medidas solicitadas
      float p = 2*base+2*altura;
      float a = base*altura;
      double d = Math.sqrt(base*base + altura*altura);
      
      //Impressão das medidas solicitadas
      System.out.printf("O perímetro do retângulo é: %.2f\n",p);
      System.out.printf("A área do retângulo é: %.2f\n",a);
      System.out.printf("A diagonal do retângulo é: %.2f\n",d);
      
    }
}
  

