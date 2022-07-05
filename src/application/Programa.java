package application;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> lista = new ArrayList<>();
        //Funcionario funcionarios = new Funcionario();

        System.out.println("Quantidade de funcionários: ");
        int n = sc.nextInt();


        for (int i=0; i<n; i++) {
            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Salário: R$ ");
            double salario = sc.nextDouble();

            Funcionario funcionarios = new Funcionario(id, nome, salario);
            lista.add(funcionarios);
//			for (Object j : lista) {
//				System.out.println(j);
//			}
        }

        System.out.print("Entre com o ID do salário que terá aumento: ");
        int idaumento = sc.nextInt();

        Funcionario aumento = lista.stream().filter(x -> x.getId() == idaumento).findFirst().orElse(null);

        System.out.print("Entre com a porcentagem do aumento: ");
        double pct = sc.nextDouble();

        aumento.aumentarSalario(pct);

        System.out.println("================");

        System.out.println("Lista de funcionários: ");
        for (Funcionario f : lista) {
            System.out.println(f);
            System.out.println();
        }

        sc.close();
    }
}
