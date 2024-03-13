package aula02;

import java.util.Scanner;

public class Tde02Ex04 {
    /*Exercício 4: Escada de String - Tde02Ex04.java

    4. Vamos criar uma escada de String! Crie um algoritmo em Java que solicite ao usuário um número.
    Esse número será a quantidade de degraus da nossa escada.
    Com essa quantidade definida, imprima no console uma sequência de Strings no formato de uma escada:*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero de degrau: ");
        int degrau = scanner.nextInt();

        String[][] matriz = new String[degrau][degrau];

        int count = degrau-1;

        for (int i = 0; i<degrau; i++) {
            for(int j = 0; j<degrau; j++) {
                if(j==count){
                    for(int x = j; x<degrau; x++) {
                        matriz[i][x] = "*";
                    }
                    for(int x = 0; x<j; x++) {
                        matriz[i][x] = " ";
                    }
                    count--;
                }
            }
        }

        for (int i = 0; i<degrau; i++) {
            for(int j = 0; j<degrau; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
