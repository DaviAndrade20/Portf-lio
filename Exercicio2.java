//crie uma funcao que receba um numero inteiro e imprima: "Numero digitado: x"
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        exibicao(numero);

        sc.close();

    }
    public static void exibicao(int x) {
        System.out.println("Número digitado: " + x);
    }
}