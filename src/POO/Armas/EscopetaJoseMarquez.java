package POO.Armas;

public class EscopetaJoseMarquez extends ArmaJoseMarquez{

    public boolean culata;
    public EscopetaJoseMarquez(){
        super();
        modelo = "Remington 870";
        culata = false;
    }

    //
    public EscopetaJoseMarquez(String modelo, int municion_maxima, int municion_actual, int rareza, boolean culata){
        this.modelo = modelo;
        this.municionMaximaCargador = municionMaximaCargador;
        this.municionActualCargador = municionActualCargador;
        this.rareza = rareza;
        this.culata = culata;
    }

    public boolean isCulata() {
        return culata;
    }

    public void setCulata(boolean culata) {
        this.culata = culata;
    }

    @Override
    public String toString(){
        return RAREZAS[rareza] + " ,______________________________________       \n" +
                "|_________________,----------._ [____]  \"\"-,__  __....-----=====\n" +
                "               (_(||||||||||||)___________/   \"\"                |\n" +
                "                  `----------'        [ ))\"-,                   |\n" +
                "                                       \"\"    `,  _,--....___    |\n" +
                "                                               `/           \"\"\"\" \n" + RESET +
                modelo + (culata ? "(Con" : "(Sin") + " Culata)\t\t\t" + municionActualCargador + " / " +
                municionMaximaCargador + "\n";

    }
    @Override
    public void disparar() {
        System.out.println("Pump");
    }
}