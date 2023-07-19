import java.util.HashMap;
import java.util.Map;

public class ContarParesComDiferenca {
    public static int contarPares(int k, int[] arr) {
        // Cria um mapa para armazenar a frequência de cada número no array
        Map<Integer, Integer> mapaFrequencia = new HashMap<>();

        // Conta a frequência de cada número no array
        for (int num : arr) {
            mapaFrequencia.put(num, mapaFrequencia.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        // Itera sobre cada número no array
        for (int num : arr) {
            int alvo1 = num - k; // Calcula o primeiro valor alvo
            int alvo2 = num + k; // Calcula o segundo valor alvo

            // Verifica se o primeiro valor alvo existe no mapa e se não é o próprio número
            if (mapaFrequencia.containsKey(alvo1) && alvo1 != num) {
                count += mapaFrequencia.get(alvo1);
            }

            // Verifica se o segundo valor alvo existe no mapa e se não é o próprio número
            if (mapaFrequencia.containsKey(alvo2) && alvo2 != num) {
                count += mapaFrequencia.get(alvo2);
            }
        }

        // Retorna o número total de pares encontrados
        return count / 2; // Divide por 2, pois cada par foi contado duas vezes
    }

    public static void main(String[] args) {
        // Exemplo de entrada
        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;

        // Chama a função para contar os pares
        int quantidadePares = contarPares(k, arr);

        // Exibe o resultado
        System.out.println(quantidadePares);
    }
}
