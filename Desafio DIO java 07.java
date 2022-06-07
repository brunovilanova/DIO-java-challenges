// Entrada
// A primeira linha contém um inteiro T representando o tipo de vinho (1 ≤ T ≤ 4). 
// A segunda linha contém cinco inteiros A, B, C, D e E, que indica a resposta dada
// por cada competidor (1 ≤ A, B, C, D, E ≤ 4).

// Saída
// A saída contém um inteiro representando o número de concorrentes que obtiveram 
// a resposta correta.

import java.util.Scanner;


public class DesafioDegustacaoDeVinhos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //System.out.print("Digite o tipo de vinho: ");
        String T = scan.nextLine();

        //System.out.print("Digite a resposta dos competidores: ");
        String respostasCompetidores = scan.nextLine();

        String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");
        
        int count = 0;
        for (String resposta : respostasCompetidoresSplit) {
            if (resposta.equals(T)) {
                count++;
            }
        }
        //System.out.print("O número de respostas corretas é: ");
        System.out.print(count);
    }
}