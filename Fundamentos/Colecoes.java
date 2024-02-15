import java.util.Map;
import java.util.HashMap;

public class Colecoes {
  public static void main(String[] args) {
    Map<String, Integer> notas = new HashMap<>();

    notas.put("Dani", 9);
    notas.put("Vini", 10);
    notas.put("Elias", 10);

    var nota = notas.get("Dani");

    System.out.println(nota);

    for (Map.Entry<String, Integer> entry : notas.entrySet()) {

      String key = entry.getKey();
      Integer value = entry.getValue();

      System.out.println(" a chave é " + key + "e o valor é " + value);
    }

  }
}
