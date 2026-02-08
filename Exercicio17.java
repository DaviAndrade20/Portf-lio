
// DADOS BANCARIOS
import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaBancaria c = new ContaBancaria();

        System.out.println("Digite os dados da conta: ");
        System.out.println("Titular: ");
        c.titular = sc.nextLine();
        System.out.println("Agência: ");
        c.agencia = sc.nextInt();
        System.out.println("Cc: ");
        c.conta = sc.nextInt();
        System.out.println("Saldo: ");
        c.saldo = sc.nextDouble();


        System.out.println("Digite a opção 1 - DEPOSITAR, 2 - SACAR: ");
        int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor de depósito: ");
                    double valor = sc.nextDouble();
                    c.depositar(valor);
                    break;
                case 2:
                    System.out.println("Digite o valor de saque: ");
                    double valor1 = sc.nextDouble();
                    c.sacar(valor1);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println(c);
        sc.close();
    }
}
