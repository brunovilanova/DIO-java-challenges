// Entrada
// A entrada contém 2 valores inteiros.

// Saída
// Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente 
// um espaço em branco antes e depois da igualdade.

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		PROD = A*B   ; //implemente o código que representa a multiplicação.
		
		System.out.println("PROD = " + PROD   );
		
		sc.close();
		
	}
}