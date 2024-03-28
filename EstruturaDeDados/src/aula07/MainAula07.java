package aula07;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainAula07 {
    public static void main(String[] args) {
        /*ex01*/
        Set<String> ex1 = new HashSet<>();
        ex1.add("apple");
        ex1.add("banana");
        ex1.add("orange");
        ex1.add("banana");

        ex1.remove("orange");

        for(String fruta : ex1) {
            System.out.println(fruta);
        }

        /*ex02*/
        Set<Integer> ex2 = new HashSet<>();

        for(int i = 0; i<10; i++){
            ex2.add(i);
        }

        System.out.println(ex2.contains(5));

        /*ex03*/
        Random random = new Random();

        Set<String> ex3 = new HashSet<>();

        for(int i = 0; i<10; i++){
            char randomChar = (char) (random.nextInt(26) + 'a');
            ex3.add(randomChar + "");
        }

        for(String letra : ex3) {
            System.out.println(letra);
        }

        /*ex04*/
        Set<Integer> ex4 = new HashSet<>();

        for(int i = 0; i<10; i++){
            int randomInt = random.nextInt(100);
            ex4.add(randomInt);
        }

        System.out.println(ex4.size());

        ex4.clear();

        System.out.println(ex4.size());

        /*ex05*/
        Set<String> ex5 = new HashSet<>();
        ex5.add("apple");
        ex5.add("banana");
        ex5.add("orange");
        ex5.add("banana");

        for(String fruta : ex5) {
            System.out.println(fruta);
        }
    }
}
