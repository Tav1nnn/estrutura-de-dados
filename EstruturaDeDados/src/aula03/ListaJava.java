package aula03;

import java.util.Arrays;

public class ListaJava {

    private final int LIST_SIZE = 10;
    private int tamanho = 0;

    public Integer[] values = new Integer[LIST_SIZE];

    public void add(Integer value) {

        // TODO validar se a lista já atingiu o limite
        if(tamanho>9) {
            aumentarTamanho();
        }

        // TODO validar se o valor do objeto é maior que zero
        if (value > 0){

            for (int i = 0; i < this.values.length; i++) {
                if (this.values[i] == null) {
                    System.out.println("Adicionando o " + value);
                    this.values[i] = value;
                    tamanho++;
                    break;
                }
            }
        } else {
            System.out.println("Só pode valor maior que zero");
        }

    }
    public Integer find(int index) {
        // TODO retorne o item pedido
        if((index-1)>= 0 && (index-1) < this.values.length) {
            return this.values[index-1];
        }
        return null;
    }

    private void aumentarTamanho() {
        // TODO DESAFIO!! Descobrir uma maneira de aumentar o tamanho do array (substituir)
        Integer[] valuesNew = new Integer[values.length+1];

        for(int i = 0; i<this.values.length; i++) {
            valuesNew[i] = this.values[i];
        }
        this.values = valuesNew;
    }

    @Override
    public String toString() {
        return "ListaJava{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
