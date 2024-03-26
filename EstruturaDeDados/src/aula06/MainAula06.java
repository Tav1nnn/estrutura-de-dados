package aula06;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainAula06 {
    public static void main(String[] args) {
        List<String> materias = new ArrayList<>();

        materias.add("Algoritimos");
        materias.add("Estrutura de dados");
        materias.add("Banco de dados");

        Aluno aluno1 = new Aluno("Otavio", new Date(103, 10, 10), materias);
        Aluno aluno2 = new Aluno("Ivan", new Date(103, 10, 10), materias);
        Aluno aluno3 = new Aluno("Murilo", new Date(103, 10, 10), materias);

        System.out.println(aluno1.mostrarMaterias());

        aluno1.addMateria("Low code");

        System.out.println(aluno1.mostrarMaterias());

        aluno1.removeMateria("Algoritimos");

        System.out.println(aluno1.mostrarMaterias());
    }
}
