package aula02;

import java.util.Scanner;

public class Tde02Ex03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite: ");
        String text = scanner.nextLine();

        int countMaiusculo = 0;
        int countMinusculo = 0;
        int countDigitos = 0;
        int countCaracteres = 0;

        for(int i = 0; i < text.length(); i++){
            if(Character.isUpperCase(text.charAt(i))) {
                countMaiusculo++;

            }else if (Character.isLowerCase(text.charAt(i))) {
                countMinusculo++;

            }else if (Character.isDigit(text.charAt(i))) {
                countDigitos++;

            } else if (!Character.isLetterOrDigit(text.charAt(i))) {
                countCaracteres++;
            }
        }

        System.out.println("Num Maiusculo: " + countMaiusculo);
        System.out.println("Num Minusculo: " + countMinusculo);
        System.out.println("Num Digito: " + countDigitos);
        System.out.println("Num Caracteres: " + countCaracteres);
    }
}
