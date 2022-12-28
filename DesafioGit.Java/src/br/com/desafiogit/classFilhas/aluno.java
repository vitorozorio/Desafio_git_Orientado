package br.com.desafiogit.classFilhas;
import br.com.desafiogit.ClassMae.pessoa;

public class aluno extends pessoa {

  private char id;
  private String turma;
  double media;

    public aluno(String nome, String cpf, String endereco, int idade, char id, String turma, double media) {
        super(nome, cpf, endereco, idade);
        this.id = id;
        this.turma = turma;
        this.media = media;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
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
