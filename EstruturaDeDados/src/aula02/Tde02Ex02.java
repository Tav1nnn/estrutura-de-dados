package aula02;

public class Tde02Ex02 {
    /*Exercício 2: Matriz - aula02.Tde02Ex02.java

    2. Escreva um programa em Java que declare e inicialize uma matriz de inteiros com 3 linhas e 3 colunas.
    Em seguida, preencha a matriz com valores de 1 a 9 (sequencialmente) e imprima a matriz.*/

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        for (int i = 0; i<matriz.length; i++) {
            for (int j = 0; j<matriz.length; j++) {
                matriz[i][j] = (i+1)*(j+1);
            }
        }

        for (int i = 0; i<matriz.length; i++) {
            for (int j = 0; j<matriz.length; j++) {
                System.out.println(matriz[i][j] + " ");
            }
        }
    }
}
