package service;

public class CPF {
    private final String cpf;

    public CPF(String cpf){

        if(cpf == null || !ehValido(cpf.replaceAll("\\D", ""))){
            throw new IllegalArgumentException("CPF inválido");
        }else this.cpf = cpf;
    }

    // Validando logica.
    private boolean ehValido(String cpf){
        return tamanhoCPF(cpf) && cpfRepetido(cpf) &&  validaDigitos(cpf);
    }

    // Verificando se o tamanho do cpf condis com 11.
    private boolean tamanhoCPF(String cpf){
        int tamanho = cpf.length();
        return tamanho == 11;
    }

    // Verificando se existe cadeia de números iguais.
    private boolean cpfRepetido(String cpf){
        boolean iguais = false;
        for(int i = 1; i < cpf.length(); i++){
            if(cpf.charAt(i) != cpf.charAt(0)){
                iguais = true;
                break;
            }
        }
        return iguais;
    }

    // Verificando se os dois últimos dígitos se condiz.
    private boolean validaDigitos(String cpf){
        int primeiro = calcularDigito(cpf, 9);
        int segundo = calcularDigito(cpf, 10);

        return primeiro == cpf.charAt(9) - '0' && segundo == cpf.charAt(10) - '0';
    }

    private int calcularDigito(String cpf, int quantidade) {
        int soma = 0;
        int peso = quantidade + 1;
        for(int i = 0; i < quantidade; i++){
            int numero = cpf.charAt(i) - '0';
            soma += numero * peso;
            peso --;
        }

        int restodaDivisao = (soma * 10) % 11;
        if(restodaDivisao == 10){
            restodaDivisao = 0;
        }

        return restodaDivisao;
    }
}
