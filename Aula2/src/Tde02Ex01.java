import java.util.ArrayList;
import java.util.Scanner;

public class Tde02Ex01 {
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
