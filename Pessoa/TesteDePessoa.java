package Pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa() ; //criando um objeto da classe Pessoa

    pessoa1.cpf = "3332222111";
    pessoa1.nome = "Andre";
    pessoa1.idade = 33;

    System.out.println(pessoa1.imprimirDadosDaPessoa());

    Pessoa pessoa2 = new Pessoa() ; //criando um objeto da classe Pessoa

    pessoa2.cpf = "33322222111";
    pessoa2.nome = "Andre";
    pessoa2.idade = 33;

    System.out.println(pessoa2.imprimirDadosDaPessoa());


  }
}
