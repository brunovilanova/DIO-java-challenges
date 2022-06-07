// Entrada
// A entrada consiste de uma única linha que contém dois inteiros H e P (1 ≤ H, P ≤ 1000) 
// indicando respectivamente o número total de coxinhas consumidas e o número total
// de participantes na competição.

// Saída
// Seu programa deve produzir uma única linha com um número racional representando
// o número médio de coxinhas consumidas pelos participantes. O resultado deve ser
// escrito como um número racional com exatamente dois dígitos após o ponto decimal
// arredondado se necessário.



// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();

    String[] inputSplit = input.split(" ");
    String H = inputSplit[0];
        String P = inputSplit[1];

        double media = Double.parseDouble(H) / Double.parseDouble(P);

        System.out.printf("%.2f", media);
//TODO: Complete os espaços em branco com uma possível solução para o desafio
    
  }
}