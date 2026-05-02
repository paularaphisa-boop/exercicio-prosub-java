import java.util.Scanner;

public class GestaoSubmarino {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // =============================
        // 1. Situação: Orçamento e Cronograma
        // =============================
        System.out.println("--- Sistema de Comando PROSUB 2026 ---");
        System.out.print("Digite o valor do repasse anual (em bilhões): ");
        double repasse = scanner.nextDouble();

        if (repasse < 0.5) {
            System.out.println("ALERTA: Risco de paralisação total. Dados estimados: 2045");
        } else if (repasse >= 0.5 && repasse <= 1.0) {
            System.out.println("Ritmo lento: Finalização prevista para 2037");
        } else {
            System.out.println("Projeto acelerado: Possibilidade de antecipação da entrega");
        }

        // =============================
        // 2. Situação: Protocolo de Acesso Internacional
        // =============================
        scanner.nextLine(); // limpar buffer

        System.out.print("\nDigite o nível de acesso: ");
        String nivel = scanner.nextLine();

        System.out.print("Digite o país: ");
        String pais = scanner.nextLine();

        if (nivel.equalsIgnoreCase("TOTAL") && !pais.equalsIgnoreCase("Brasil")) {
            System.out.println("ACESSO NEGADO: Soberania Nacional preservada. Dados criptografados");
        } else if (pais.equalsIgnoreCase("Brasil")) {
            System.out.println("Acesso autorizado ao Almirantado");
        }

        // =============================
        // 3. Situação: Propulsão
        // =============================
        System.out.print("\nDigite a temperatura do reator (°C): ");
        double temperatura = scanner.nextDouble();

        if (temperatura < 280) {
            System.out.println("Aumentar potência do reator");
        } else if (temperatura >= 280 && temperatura <= 350) {
            System.out.println("Operação Normal - Cruzeiro");
        } else {
            System.out.println("EMERGÊNCIA: Acionar sistema de resfriamento e emergência");
        }

        scanner.close();
    }
}