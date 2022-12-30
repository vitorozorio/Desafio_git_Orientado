package br.com.desafiogit.classFilhas;
import br.com.desafiogit.ClassMae.pessoa;

public class Funcionario extends pessoa {

    private int id;
    private String cargo;

    public Funcionario(String nome, String cpf, String endereco, int idade, int id, String cargo) {
        super(nome, cpf, endereco, idade);
        this.id = id;
        this.cargo = cargo;
    }

    public int getId() {
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
