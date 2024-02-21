// Importa a classe Set da biblioteca java.util.
import java.util.Set;

// Importa a classe HashSet da biblioteca java.util.
import java.util.HashSet;

public class ColecaoHashSet {

  // Define o método main como ponto de entrada da aplicação.
  public static void main(String[] args) {

    // Cria um objeto Set do tipo HashSet com elementos do tipo Integer.
    Set<Integer> numeros = new HashSet<>();

    // Adiciona elementos ao conjunto usando o método add().
    numeros.add(10);
    numeros.add(11);
    numeros.add(12);
    numeros.add(13);

    // Itera sobre o conjunto usando um loop for-each.
    for (Integer elemento : numeros) {
      // Imprime cada elemento do conjunto.
      System.out.println(elemento); // Imprime 10, 11, 12, 13
    }

    // Verifica se o elemento 13 está presente no conjunto usando o método contains().
    System.out.println(numeros.contains(13)); // Imprime true

  }
}
