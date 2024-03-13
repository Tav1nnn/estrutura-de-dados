package aula01;

import java.util.Scanner;

public class Tde01ex03 {
    /*
    // Criando uma tabuada
    3- Criar uma nova classe chamada Tde01ex03 e definir um método main;
        a) solicitar ao usuário um número inteiro e positivo (validar a entrada e mostrar mensagem de erro caso o usuário entre com um valor inválido);
        b) imprimir no console uma sequência de mensagens contendo a tabuada do valor informado pelo usuário. Imprimir no seguinte modelo:

        Tabuda do 2:
        2 x 1 = 2
        2 x 2 = 4
        2 x 3 = 6
        ... continue até 10;

    // Calculando a média das notas
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero positivo: ");
        int num = scanner.nextInt();

        while (num<0){
            System.out.println("Numero não pode ser negativo");
            System.out.println("Digite um numero positivo: ");
            num = scanner.nextInt();
        }

        for(int i = 1; i<=10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }

    }
}
