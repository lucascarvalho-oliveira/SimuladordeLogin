package model;

import service.CPF;
import service.Email;

public class Pessoa {
    private String nome;
    private int idade;
    private CPF cpf;
    private Email email;

    public Pessoa (String nome, int idade, CPF cpf, Email email){
       if(nome == null || nome.trim().isEmpty()) throw new IllegalArgumentException("Nome invalido.");
       if(idade < 18) throw new IllegalArgumentException("Para fazer o cadastro tem que ser maior de idade.");
       if(cpf == null) throw new IllegalArgumentException("CPF invalido.");
       if(email == null) throw new IllegalArgumentException("Email invalido.");

       this.nome = nome;
       this.idade = idade;
       this.cpf = cpf;
       this.email = email;
    }

}
