import java.util.Scanner;

public class Tde02Ex01 {

    /*Exercício 1: Array - Tde02Ex01.java
    1. Crie um programa em Java que declare e inicialize um array de inteiros com 5 elementos.
    Em seguida, imprima cada elemento do array.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        for(int i = 0; i<array.length; i++) {
            System.out.println("Digite um valor: ");
            array[i] = scanner.nextInt();
        }

        for(int i = 0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
