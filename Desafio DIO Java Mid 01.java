// Entrada
// O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

// Saída
// Imprima a variável MEDIA conforme exemplo abaixo, com 1 dígito após o ponto decimal
// e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas
// não esqueça de imprimir o fim de linha após o resultado, 
// caso contrário, você receberá "Presentation Error".


import java.util.Scanner;



public class Main {

 public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

  double nota1 = input.nextDouble();

  double nota2 = input.nextDouble();

  double nota3 = input.nextDouble();



  double media = ((nota1 * 2  ) + (nota2 *  3 ) + (nota3 *5  )) / (2+3+5);

  System.out.printf("MEDIA = %.1f", media);

