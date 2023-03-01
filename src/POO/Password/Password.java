package POO.Password;

import java.util.Random;

public class Password {
    private int longitud;
    private String contrasenha;

    public Password() {
        this.longitud = 8;
        generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (int i = 0; i < contrasenha.length(); i++) {
            char c = contrasenha.charAt(i);
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }
        return (mayusculas > 2 && minusculas > 1 && numeros > 5);
    }

    public void generarPassword() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int index = rand.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }

        contrasenha = sb.toString();
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }
}