package Pessoa;

public class TesteDePessoa {

  public static void main(String[] args) {
    Professor professor = new Professor();

    professor.setCpf("333222211");
    professor.setNome("André");
    professor.setIdade(25);
    professor.setSalario(50000);

    System.out.println(professor.imprimirDadosDaPessoa());

    Aluno aluno = new Aluno();
    aluno.setCpf("1122334455");
    aluno.setIdade(20);
    aluno.setNome("Anna");
    aluno.setMatricula("2307");

    System.out.println(aluno.imprimirDadosDaPessoa());

  }

}