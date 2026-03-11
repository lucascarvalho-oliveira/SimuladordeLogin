<p align="center">
  <a href="./docs/README.en.md">
    <img src="https://img.shields.io/badge/Language-English-blue?style=for-the-badge">
  </a>
</p>

# Simulador de Criação de Login

Este projeto é um **simulador de criação de cadastro de usuário desenvolvido em Java**, com o objetivo de praticar conceitos fundamentais da linguagem e de **Programação Orientada a Objetos (POO)**.
O sistema simula o processo de criação de um login, realizando validações de dados como **CPF e senha**, sem utilizar banco de dados ou persistência de informações.
O foco do projeto é aplicar boas práticas de organização de código e regras de negócio em um ambiente simples de console.

## Funcionalidades

* Entrada de dados pelo terminal
* Criação de um cadastro de usuário
* Validação de CPF
* Validação de senha
* Organização do código utilizando **POO**
* Separação de responsabilidades entre classes
* Simulação do processo de criação de login

> Este projeto é apenas um **simulador educacional**.
Os dados não são armazenados em banco de dados.

## Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Entrada de dados com `Scanner`
* Estrutura de pacotes

# Estrutura do Projeto

```
src/
│
├── app/
│   └── Main.java           # Classe principal do sistema
│
├── model/
│   └── Pessoa.java         # Representação do usuário
│
└── service/
    ├── CPF.java            # Validação de CPF
    └── Senha.java          # Validação de senha
```

## Como Executar o Projeto

1. Clone o repositório
```
git clone https://github.com/lucascarvalho-oliveira/SimuladordeCriarLogin.git
```

2. Acesse a pasta do projeto
```
cd SimuladordeCriarLogin
```

3. Compile o projeto
```
javac -d bin src/**/*.java
```

4. Execute o programa
```
java -cp bin app.Main
```
# Objetivo do Projeto

Este projeto foi desenvolvido para praticar:

* Criação de classes e objetos
* Encapsulamento
* Organização de pacotes
* Validação de dados
* Estrutura básica de um sistema de cadastro

# Melhorias Futuras

Algumas melhorias que podem ser implementadas no projeto:

* Persistência de dados em banco de dados
* Interface gráfica (JavaFX ou Swing)
* Sistema completo de login e autenticação
* Criptografia de senha
* API para cadastro de usuários
