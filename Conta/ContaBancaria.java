package Conta;

public class ContaBancaria {
  String numero;
  String titular;
  double saldo;

  // depositar
  void depositar(double valor) {
    if (valor > 0) {
      saldo = saldo + valor;
      System.out.println("deposito de R$: " + valor + " . Saldo autal: R$ " + saldo);
    } else {
      System.out.println("O valor é invalido");
    }
  }

  // sacar

  void sacar(double valor) {
    if (valor > 0 && valor <= saldo) {
      saldo = saldo - valor;
      System.out.println("Saque de R$: " + valor + ". Saldo atual: R$ " + saldo);
    }
  }
}
