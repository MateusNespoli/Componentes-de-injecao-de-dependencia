package app;

import entities.Employee;
import services.PensionService;
import services.SalaryService;
import services.TaxService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

   public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Utilizando componentes//

       System.out.print("Nome: ");
       String name = sc.nextLine();
       System.out.print("Salario bruto: ");
       double grossSalary = sc.nextDouble();

       Employee employee = new Employee(name, grossSalary);

       TaxService taxService = new TaxService();
       PensionService pensionService = new PensionService();

       SalaryService salaryService = new SalaryService(taxService, pensionService);

       double netSalary = salaryService.netSalary(employee);
       System.out.printf("Salario liquido = %.2f%n", netSalary);

       sc.close();

        /*
           //Forma facil de fazer//

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Salario bruto: ");
        double grossSalary = sc.nextDouble();
        double netSalary = grossSalary * 0.7;
        System.out.printf("Salario liquido = %.2f%n", netSalary);
        sc.close();

        */
    }

}
