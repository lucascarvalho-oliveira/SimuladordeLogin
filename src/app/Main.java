package app;

import java.util.Scanner;
import model.Pessoa;
import service.CPF;
import service.Senha;
import service.Email;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome e sobre nome:");
        String nome = sc.nextLine();

        System.out.println("Qual a sua idade:");
        int idade = sc.nextInt();

        sc.nextLine();
        System.out.println("Informe o seu email");
        String email = sc.nextLine();

        System.out.println("Qual o seu CPF:");
        String cpf = sc.nextLine();

        Email meuEmail = new Email(email);
        CPF meuCpf = new CPF(cpf);

        Pessoa pessoa = new Pessoa(nome, idade, meuCpf, meuEmail);

        System.out.println("Crie uma senha:");
        String senha = sc.nextLine();

        Senha minhaSenha = new Senha(senha);

        System.out.println();
        System.out.println("login criado com sucesso!");

        sc.close();
    }
}
