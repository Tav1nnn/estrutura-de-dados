package aula06;
import java.util.Date;
import java.util.List;

public class Aluno {
    // Atributos
    private String nome;
    private Date dataNascimento;
    private List<String> materias;

    // Construtor
    public Aluno() {
    }

    public Aluno(String nome, Date dataNascimento, List<String> materias) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.materias = materias;
    }

    public String mostrarMaterias(){
        return "Materias = ["
                + String.join(", ", materias)
                +"]";
    }

    public void addMateria(String materia){
        this.materias.add(materia);
    }

    public void removeMateria(String materia){
        this.materias.remove(materia);
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void setMaterias(List<String> materias) {
        this.materias = materias;
    }

}
