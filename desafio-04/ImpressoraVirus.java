import java.util.Scanner;

public class ImpressoraVirus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numCasosTeste = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após a leitura do número de casos de teste
        
        for (int i = 0; i < numCasosTeste; i++) {
            String linhaImpressa = scanner.nextLine();
            String linhaOriginal = decifrarLinha(linhaImpressa);
            System.out.println(linhaOriginal);
        }
        
        scanner.close();
    }
    
    public static String decifrarLinha(String linhaImpressa) {
        int tamanho = linhaImpressa.length();
        StringBuilder linhaOriginal = new StringBuilder(tamanho);
        
        for (int i = 0; i < tamanho / 2; i++) {
            linhaOriginal.append(linhaImpressa.charAt(tamanho - 1 - i));
            linhaOriginal.append(linhaImpressa.charAt(i));
        }
        
        return linhaOriginal.toString();
    }
}
