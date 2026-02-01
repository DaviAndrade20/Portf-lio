/*Fazer um programa para ler os dados de umfuncionário (nome, salário bruto e imposto). 
Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem)
e mostrar novamente os dados do funcionário. Use a classe projetada abaixo.
 */
import java.util.Locale;
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String []args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("Name: ");
        emp.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println("Employee: " + emp);

        System.out.println("Which percentage to increase salary?");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println("Update data: " + emp);


        sc.close();
    }
}
