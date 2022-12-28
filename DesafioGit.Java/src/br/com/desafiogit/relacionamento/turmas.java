package br.com.desafiogit.relacionamento;
import br.com.desafiogit.classFilhas.funcionario;
import br.com.desafiogit.classFilhas.aluno;

public class turmas {

    private char id;
    private String nomeDaTurma;
    private aluno[] alunos;
    private funcionario responsavel;

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

    public aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(aluno[] alunos) {
        this.alunos = alunos;
    }

    public funcionario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(funcionario responsavel) {
        this.responsavel = responsavel;
    }


}


