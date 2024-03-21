package aula05;

public class MainAula05 {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Pampa", 1983, 45000.00);

        System.out.println(carro.mostrarInformacoes());

        carro.aplicarDesconto(10.00);

        System.out.println(carro.mostrarInformacoes());
    }
}
