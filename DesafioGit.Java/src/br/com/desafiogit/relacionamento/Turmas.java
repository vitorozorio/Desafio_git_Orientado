package br.com.desafiogit.relacionamento;
import br.com.desafiogit.classFilhas.Funcionario;
import br.com.desafiogit.classFilhas.Aluno;

public class Turmas {

    private char id;
    private String nomeDaTurma;
    private Aluno[] alunos;

    private Funcionario responsavel;

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public String getNomeDaTurma() {
        return nomeDaTurma;
    }

    public void setNomeDaTurma(String nomeDaTurma) {
        this.nomeDaTurma = nomeDaTurma;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }


}


