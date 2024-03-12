import java.util.Scanner;

public class Tde01ex02 {
    /* Calulando a área de um retângulo
2- Criar uma nova classe chamada Tde01ex02 e definir um método main;
    a) solicitar ao usuário a largura e posteriormente a altura de um retângulo;
    b) imprimir no console uma mensagem informando o valor da área do retângulo com as medidas informadas;*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura do retangulo: ");
        float altura = scanner.nextFloat();

        System.out.println("Digite a largura do retagulo: ");
        float largura = scanner.nextFloat();

        System.out.println("Area: " + altura*largura);
    }
}
