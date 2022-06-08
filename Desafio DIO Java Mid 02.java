// Entrada
// O arquivo de entrada contém um valor de ponto flutuante (dupla precisão)
// correspondente ao raio da esfera.

// Saída
// A saída deverá ser uma mensagem "VOLUME" conforme o exemplo fornecido abaixo
// com um espaço antes e um espaço depois da igualdade. O valor deverá ser 
// apresentado com 3 casas após o ponto.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);
 //TODO: Complete os espaços em branco com uma possível solução para o desafio 
  		double pi = 3.14159;
  		double R = sc.nextDouble();
  		double volume = ( (4.0/3) ) * pi * (Math.pow(R, 3.0));

  System.out.printf("VOLUME = %.3f%n", volume );
    }
	
}