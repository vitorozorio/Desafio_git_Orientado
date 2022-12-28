package br.com.desafiogit.classFilhas;
import br.com.desafiogit.ClassMae.pessoa;

public class funcionario extends pessoa {

    private char id;
    private String cargo;

    public funcionario(String nome, String cpf, String endereco, int idade, char id, String cargo) {
        super(nome, cpf, endereco, idade);
        this.id = id;
        this.cargo = cargo;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
