package aula05;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;
    private Boolean disponibilidade;

    public Produto(String nome, Double preco, Integer quantidade, Boolean disponibilidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.disponibilidade = disponibilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", disponibilidade=" + disponibilidade +
                '}';
    }
}
