import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora c = new Calculadora();

        System.out.println("Digite dois números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int resultadoSoma = c.soma(n1, n2);   //Criei variaveis para chamar os metodos;
        int resultadoSub = c.subtrair(n1, n2);

        c.imprimirResultado(resultadoSoma);  //Um método chama um resultado por vez;
        c.imprimirResultado(resultadoSub);

        sc.close();
    }
}
