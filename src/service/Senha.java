package service;

public class Senha {
    private String senha;

    public Senha(String senha){
        if(!ehValido(senha)){
            throw new IllegalArgumentException("Senha incorreta, no mínimo 8 caracteres, e no mínimo 1 simbolo.");
        }else  this.senha = senha;
    }

    // Validando logica.
    private boolean ehValido(String senha){
        return senha != null && senha.length() >= 8 && validarSimbolos(senha);
    }

    // Verificando se a senha contém simbolos.
    private boolean validarSimbolos(String senha){
        String simbolos = ".*[^a-zA-Z0-9].*";

        return senha.matches(simbolos);
    }
}
