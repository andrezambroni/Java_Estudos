package Execoes;

import Pessoa.Pessoa;

public class Excecoes {

  // checked exceptions

  // unchecked exceptions

  public static void main(String[] args) throws Exception {

    // try {
    //   validarNumero();
    // } catch (Exception e) {
    //   System.out.println("deu ruim");
    // }  

    Pessoa p = null;
    p.getCpf();
    

  }

  public static void validarNumero() throws Exception {
    int numero = 10;
    if (numero < 100) {
      throw new Exception("O valor é menor que 100");
    }
  }

}
