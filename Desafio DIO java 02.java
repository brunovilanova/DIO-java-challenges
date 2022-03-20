
/*
Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int i = 1;
        
        System.out.println("Número: ");
        numero = scan.nextInt();
        System.out.print("Lista de números pares de 0 até "+numero+": \n");  
        do{
            if (i % 2 == 0) {
              System.out.print(i+"\n");
            }
            i++;
        } while (i <= numero);
    }
}