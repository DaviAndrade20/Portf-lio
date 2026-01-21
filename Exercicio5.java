// Crie uma funcao void que receba um numero inteiro e imprima os numeros de 1 ate esse numero
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        while (num <= 0) {
            System.out.println("Valor inválido. Digite outro: ");
            num = sc.nextInt();
        }

        exibirNumeros(num);

        sc.close();
    }
    public static void exibirNumeros(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }
}
