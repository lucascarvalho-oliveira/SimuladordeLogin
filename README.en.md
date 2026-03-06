<p align="center">
  <a href="./README.md">
    <img src="https://img.shields.io/badge/Language-Português-green?style=for-the-badge">
  </a>
</p>

# Login Creation Simulator

This project is a **user registration simulator developed in Java**, created to practice fundamental concepts of the language and **Object-Oriented Programming (OOP)**.
The system simulates the process of creating a user login, performing validations such as **CPF and password validation**, without using a database or data persistence.
The main goal of this project is to practice **code organization, class separation, and basic business rules** in a simple console application.

# Features

* User input through the terminal
* User registration simulation
* CPF validation
* Password validation
* Code organization using **Object-Oriented Programming (OOP)**
* Separation of responsibilities between classes
* Simulation of a basic login creation process

> This project is an **educational simulator**.
No data is stored in a database.

# Technologies Used

* Java
* Object-Oriented Programming (OOP)
* `Scanner` for user input
* Package organization

# Project Structure

```
src/
│
├── app/
│   └── Main.java           # Main class (application entry point)
│
├── model/
│   └── Pessoa.java         # User representation
│
└── service/
    ├── CPF.java            # CPF validation
    └── Senha.java          # Password validation
```

# How to Run the Project

1. Clone the repository
```
git clone https://github.com/lucascarvalho-oliveira/SimuladordeCriarLogin.git
```

2. Navigate to the project folder
```
cd SimuladordeCriarLogin
```

3. Compile the project
```
javac -d bin src/**/*.java
```

4. Run the program
```
java -cp bin app.Main
```

# Project Purpose

This project was created to practice:

* Creating classes and objects
* Encapsulation
* Package organization
* Data validation
* Basic structure of a user registration system

# Possible Future Improvements

Some improvements that could be implemented:

* Data persistence using a database
* Graphical interface (JavaFX or Swing)
* Full login and authentication system
* Password hashing
* REST API for user registration
