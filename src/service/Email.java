package service;

import java.util.regex.Pattern;

public class Email {
    private final String email;
    private static String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

    public Email(String email){
        if(email == null || !validar(email)){
            throw new IllegalArgumentException("E-mail inválido.");
        }

        this.email = email;
    }

    public boolean validar(String email){
        return Pattern.compile(EMAIL_REGEX).matcher(email).matches();
    }
}
