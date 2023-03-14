package POO.Armas;

public class ArmaJoseMarquez {
    public static final String RAREZAS[] = {"\033[0;37m", "\033[0;32m",
            "\033[0;36m", "\033[0;35m", "\033[0;33m"};
    public static final String RESET = "\033[0m";

    public String modelo = "";
    public int municionMaximaCargador;
    public int municionActualCargador;
    public int rareza;

    // Declaración de constructor vacío con datos por defecto.
    public ArmaJoseMarquez(){
        modelo = "Sig-Sauer P-226";
        municionMaximaCargador = 20;
        municionActualCargador = 20;
        rareza = 0;
    }

    //
    public ArmaJoseMarquez(String modelo, int municion_maxima, int municion_actual, int rareza){
        this.modelo = modelo;
        this.municionMaximaCargador = municionMaximaCargador;
        this.municionActualCargador = municionActualCargador;
        this.rareza = rareza;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("El modelo del arma no puede ser null o vacío");
        } else {
            this.modelo = modelo;
        }

    }

    public int getMunicionMaximaCargador() {
        return municionMaximaCargador;
    }

    public void setMunicionMaximaCargador(int municionMaximaCargador) {
        if(municionMaximaCargador < 0) {
            throw new IllegalArgumentException("La munición máxima del cargador no puede ser negativa");
        } else {
            this.municionMaximaCargador = municionMaximaCargador;
        }

    }

    public int getMunicionActualCargador() {
        return municionActualCargador;
    }

    public void setMunicionActualCargador(int municionActualCargador) {
        if(municionActualCargador < 0 || municionActualCargador <= municionMaximaCargador) {
            throw new IllegalArgumentException("La munición actual del cargador no puede ser negativa");
        } else {
            this.municionActualCargador = municionActualCargador;
        }
    }

    public int getRareza() {
        return rareza;
    }

    public void setRareza(int rareza) {
        if(rareza < 0 || rareza > 4) {
            this.rareza = rareza;
        } else {
            throw new IllegalArgumentException("La rareza del arma debe estar entre 0 y 4");
        }
    }

    @Override
    public String toString() {
        return RAREZAS[rareza] + " +--^----------,--------,-----,--------^-,\n" +
                " | |||||||||   `--------'     |          O\n" +
                " `+---------------------------^----------|\n" +
                "   `\\_,---------,---------,--------------'\n" +
                "     / XXXXXX /'|       /'\n" +
                "    / XXXXXX /  `\\    /'\n" +
                "   / XXXXXX /`-------'\n" +
                "  / XXXXXX /\n" +
                " / XXXXXX /\n" +
                "(________(                \n" +
                " `------'              \n" + RESET +
                modelo + "\t\t\t" + municionActualCargador + " / " + municionMaximaCargador + "\n";
    }
    public void disparar() {
        System.out.println("Pam");
    }
}
