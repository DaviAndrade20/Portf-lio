// Crie uma funcao void que recebe um numero inteiro e informe se ele e positivo, negativo ou nulo.
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String []args) {
        resultado();


    }
    public static void resultado() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println(num + " é negativo.");
        }
        else if (num == 0) {
            System.out.println(num + " é nulo.");
        }
        else {
            System.out.println(num + " é positivo.");
        }


        sc.close();
    }
}
