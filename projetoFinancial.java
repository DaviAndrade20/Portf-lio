import java.util.Locale;
import java.util.Scanner;

public class projetoFinancial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("       Olá! Eu sou Jake");
        System.out.println("   Seu assistente financeiro pessoal");
        System.out.println("========================================");

        System.out.print("Qual é o seu nome? ");
        String nome = sc.nextLine();
        System.out.println("Prazer em te conhecer, " + nome + "!");
        System.out.println("Vou te ajudar a ter uma visão clara das suas finanças.");

        System.out.println("========================================");
        System.out.print("Qual é a sua renda mensal? R$ ");
        double rendaMensal = sc.nextDouble();
        System.out.printf("Ok, sua renda mensal é: R$ %,.2f%n", rendaMensal);

        System.out.println("Agora vamos falar sobre seus gastos mensais. Se não tiver algum gasto, digite 0.");
        System.out.println("========================================");

        System.out.print("Valor do aluguel: R$ ");
        double valorAluguel = sc.nextDouble();

        System.out.print("Gastos com transporte: R$ ");
        double valorTransporte = sc.nextDouble();

        System.out.print("Gastos com alimentação: R$ ");
        double valorAlimentacao = sc.nextDouble();

        System.out.print("Outras dívidas ou contas (cartão, plano de saúde, celular etc.): R$ ");
        double valorDividas = sc.nextDouble();

        System.out.println("========================================");

        double resultadoGastos = totalGastos(valorAlimentacao, valorAluguel, valorDividas, valorTransporte);
        double valorSobra = subtracao(rendaMensal, resultadoGastos);

        System.out.println("========================================");
        System.out.println("RESUMO FINANCEIRO INICIAL");
        System.out.println("========================================");
        System.out.printf("%-25s: R$ %,.2f%n", "Renda Mensal", rendaMensal);
        System.out.printf("%-25s: R$ %,.2f%n", "Total de Gastos", resultadoGastos);
        System.out.printf("%-25s: R$ %,.2f%n", "Saldo", valorSobra);

        final double TOLERANCIA = 0.01;
        diagnostico(valorSobra, TOLERANCIA);

        int opcoes;
        do {
            System.out.println("\n========================================");
            System.out.println("           MENU PRINCIPAL");
            System.out.println("========================================");
            System.out.println("1 - Ver resumo financeiro novamente");
            System.out.println("2 - Descobrir qual é seu maior gasto");
            System.out.println("3 - Simular redução de custos");
            System.out.println("4 - Encerrar programa");
            System.out.println("========================================");
            System.out.print("Escolha uma opção: ");
            opcoes = sc.nextInt();

            switch (opcoes) {
                case 1:
                    System.out.println("\n========================================");
                    System.out.println("          RESUMO FINANCEIRO");
                    System.out.println("========================================");
                    System.out.printf("%-25s: R$ %,.2f%n", "Renda Mensal", rendaMensal);
                    System.out.printf("%-25s: R$ %,.2f%n", "Total de Gastos", resultadoGastos);
                    System.out.printf("%-25s: R$ %,.2f%n", "Saldo", valorSobra);
                    diagnostico(valorSobra, TOLERANCIA);
                    break;

                case 2:
                    double maior = maiorDespesa(valorAlimentacao, valorAluguel, valorDividas, valorTransporte);
                    System.out.printf("Sua maior despesa mensal é: R$ %,.2f%n", maior);
                    break;

                case 3:
                    System.out.print("Digite o valor que deseja reduzir: R$ ");
                    double reducao = sc.nextDouble();
                    custosReduzidos(reducao, valorSobra);
                    break;

                case 4:
                    System.out.println("Sistema encerrado. Até a próxima!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcoes != 4);

        sc.close();
    }

    public static double totalGastos(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    public static double subtracao(double x, double y) {
        return x - y;
    }

    public static double maiorDespesa(double a, double b, double c, double d) {
        if (a > b && a > c && a > d) return a;
        else if (b > c && b > d) return b;
        else if (c > d) return c;
        else return d;
    }

    public static void custosReduzidos(double a, double b) {
        System.out.printf("Com o valor informado, sua redução de custos resultaria em: R$ %,.2f%n", (b - a));
    }

    public static void diagnostico(double saldo, double tolerancia) {
        if (saldo < -tolerancia) {
            System.out.println("ALERTA: você está em déficit financeiro!");
        } else if (Math.abs(saldo) <= tolerancia) {
            System.out.println("Atenção: você está operando no limite.");
        } else if (saldo > 0 && saldo <= 200) {
            System.out.println("Requer estratégia: saldo positivo, mas ainda baixo.");
        } else if (saldo <= 700) {
            System.out.println("Situação intermediária: há margem de manobra.");
        } else {
            System.out.println("Situação confortável: finanças sob controle.");
        }
    }
}
