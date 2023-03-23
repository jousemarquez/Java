package poo.armas;

public class EscopetaJoseMarquez extends ArmaJoseMarquez {

    public boolean culata;
    public EscopetaJoseMarquez(){
        super();
        modelo = "Remington 870";
        culata = false;
    }

    //
    public EscopetaJoseMarquez(String modelo, int municionMaximaCargador, int municionActualCargador, int rareza,
                               boolean culata){
        super(modelo, municionMaximaCargador, municionActualCargador, rareza); // Herencia de clase padre
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