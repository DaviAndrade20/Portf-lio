// Cria uma funcao que recebe dois numeros inteiros, calcule a soma e imprima o resultado.
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String []args) {

        resultado();

    }
    public static void resultado() {
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite um number: ");
            int num1 = sc.nextInt();

            System.out.println("Digite um outro number: ");
            int num2 = sc.nextInt();

            int soma = num1 + num2;

            System.out.println("Resultado: " + soma);
            sc.close();
    }
}
