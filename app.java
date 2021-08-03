package Exercicio11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de contribuintes: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Pessoa> lista_pessoas = new ArrayList<>();

        for(int i=1; i<=n; i++){
            System.out.println("pessoa pagadora #" + i +": ");
            System.out.print("Individual or company (i/c)? ");
            char people = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double income = sc.nextDouble();
            if (people == 'i'){
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                lista_pessoas.add(new PessoaFisica(name, income, health));
            } else {
                System.out.print("Number of employess: ");
                int emp = sc.nextInt();
                lista_pessoas.add(new Pessoa_juridica(name, income, emp));
            }
        }

        System.out.println("");
        System.out.println("TAXES PAID:");
        double sum = 0;
        for(Pessoa p:lista_pessoas){
            sum += p.tax();
            System.out.println(p.ToString());
        }
        System.out.println("");
        System.out.println("TOTAL TAX: " + String.format("%.2f", sum));

        sc.close();
    }
}
