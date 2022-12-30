package br.com.desafiogit;
import br.com.desafiogit.classFilhas.Aluno;
import br.com.desafiogit.classFilhas.Funcionario;
import br.com.desafiogit.relacionamento.Turmas;

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
       Scanner Texto = new Scanner(System.in);

       Aluno vitor = new Aluno("vitor","495.715.908.43","jardinopolis",20,222,"ads",0);
       Aluno Igor = new Aluno("igor","333...","rio",24,333,"ads",0);

       Funcionario Caio = new Funcionario("caio","555.666.777.88","ribeirão",21,555,"professor");

       Aluno[] AlunosAds = new Aluno[2];
       AlunosAds[0] = vitor;
       AlunosAds[1] = Igor;

       Turmas Ads = new Turmas();

       Ads.setAlunos(AlunosAds);
       Ads.setResponsavel(Caio);

       if(Ads.getResponsavel() != null) {

           System.out.println("Professor : " + Ads.getResponsavel().getNome());

       }

       if(Ads.getAlunos() != null) {

          for (Aluno a : Ads.getAlunos()) {

              System.out.println("Alunos : " + a.getNome());

          }
       }













































    }
}
