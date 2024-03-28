package aula08;

import aula06.Aluno;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MainAula08 {
    public static void main(String[] args) {

        /*ex01*/
        LocalDate localDate = LocalDate.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(localDate.format(formato));

        /*ex02*/
        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println(localDateTime.format(formato2));

        /*ex03*/

        Map<String, Integer> map = new HashMap<>();
        map.put("Otavio", 13);
        map.put("Gabriel", 13);
        map.put("Ivan", 13);

        System.out.println(map);

        /*ex04*/
        Map<String, Aluno> mapAluno = new HashMap<>();

        Aluno aluno1 = new Aluno("Otavio", new Date(100, 12, 25), new ArrayList<>());
        Aluno aluno2 = new Aluno("Gabriel", new Date(100, 12, 25), new ArrayList<>());
        Aluno aluno3 = new Aluno("Ivan", new Date(100, 12, 25), new ArrayList<>());

        mapAluno.put(aluno1.getNome(), aluno1);
        mapAluno.put(aluno2.getNome(), aluno2);
        mapAluno.put(aluno3.getNome(),aluno3);

        LocalDate localDate1 = LocalDate.now();

        for(Map.Entry<String, Aluno> entry : mapAluno.entrySet()){
            LocalDate dataNascimentoLocalDate = entry.getValue().getDataNascimento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int idade = Period.between(dataNascimentoLocalDate,localDate1).getYears();

            System.out.println(entry.getKey() + " " + idade);
        }

        /*ex05*/

    }
}
