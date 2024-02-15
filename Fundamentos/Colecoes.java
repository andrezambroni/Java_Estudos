// Importa a classe Map da biblioteca java.util.
import java.util.Map;

// Importa a classe HashMap da biblioteca java.util.
import java.util.HashMap;

public class Colecoes {

  // Define o método main como ponto de entrada da aplicação.
  public static void main(String[] args) {

    // Cria um objeto Map do tipo HashMap com chave String e valor Integer.
    Map<String, Integer> notas = new HashMap<>();

    // Adiciona pares chave-valor ao mapa usando o método put().
    notas.put("Dani", 9);
    notas.put("Vini", 10);
    notas.put("Elias", 10);

    // Obtém o valor associado à chave "Dani" usando o método get().
    var nota = notas.get("Dani");

    // Imprime o valor da variável "nota".
    System.out.println(nota); // Imprime 9

    // Itera sobre o mapa usando um loop for-each.
    for (Map.Entry<String, Integer> entry : notas.entrySet()) {

      // Obtém a chave e o valor da entrada atual.
      String key = entry.getKey();
      Integer value = entry.getValue();

      // Imprime a chave e o valor da entrada atual.
      System.out.println(" a chave é " + key + " e o valor é " + value);
    }

  }
}
