/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano 
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. 
Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno 
obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para resolver este problema.
 */
import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String []args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.println("Name and notes: ");
        s.name = sc.nextLine();
        s.grade1 = sc.nextDouble();
        s.grade2 = sc.nextDouble();
        s.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", s.finalGrade());

        if (s.finalGrade() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING POINTS: %.2f%n", s.missingPoints());
        }
        else {
            System.out.println("PASS");
        }


        sc.close();
    }
}
