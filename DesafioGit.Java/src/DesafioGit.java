import java.util.Scanner;

/**
 * uma nova versão do desafio git com orientação sera criada.
 * aqui iremos usar boas praticas de programação e melhores maneiras de
 * resolvermos o desafio.
 *
 * @author Vitorozorio;
 */

public class DesafioGit {
    public static void main(String[] args) {

       int nota1, nota2, nota3, nota4, mediaFinal;
       int login;
       Scanner teclado = new Scanner(System.in);

       Funcionario Professor = new Funcionario();
       Professor.nome = "vitor";
       Professor.idade = 20;
       Professor.endereco = "jardinopolis sp, rua 12";
       Professor.id_funcionario = 123456;
       Professor.setor = "dar aula para os alunos e calcular as medias";

       Funcionario Cordenador = new Funcionario();
       Cordenador.nome = "caio";
       Cordenador.idade = 22;
       Cordenador.endereco = "algum lugar de ribeirão";
       Cordenador.id_funcionario = 654321;

       Turmas Turma1 = new Turmas();
       Turma1.id_Turma = 3345;
       Turma1.Nome_Turma = "aurora";

       Turmas Turma2 = new Turmas();
       Turma2.id_Turma = 3322;
       Turma2.Nome_Turma = "pequenos";


    }
}