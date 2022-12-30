package br.com.desafiogit.classFilhas;
import br.com.desafiogit.ClassMae.pessoa;

public class Aluno extends pessoa {

  private int id;
  private String turma;
  private double media;

    public Aluno(String nome, String cpf, String endereco, int idade, int id, String turma, double media) {
        super(nome, cpf, endereco, idade);
        this.id = id;
        this.turma = turma;
        this.media = media;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
