import java.util.Scanner;

public class Tde01ex04 {
    /*// Calculando a média das notas
    4- Criar uma nova classe chamada Tde01ex04 e definir um método main;
    a) solicitar ao usuário 4 notas (pode conter valores decimais);
    b) imprimir no console uma mensagem contendo a média das 4 notas informadas;*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nome 1");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite nome 2");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite nome 3");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite nome 4");
        double nota4 = scanner.nextDouble();

        System.out.println("Media: " + ((nota1+nota2+nota3+nota4)/4));
    }
}
