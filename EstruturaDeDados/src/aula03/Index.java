package aula03;

public class Index {
    public static void main(String[] args) {

        ListaJava listaJava = new ListaJava();
        for (int i = 0; i<=15; i++) {
            listaJava.add(i);
        }

        for (int i = 1; i <= 20; i++) {
            System.out.println(listaJava.find(i));
        }

        System.out.println(listaJava);
    }
}
