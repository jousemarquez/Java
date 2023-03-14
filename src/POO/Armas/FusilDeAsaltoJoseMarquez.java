package POO.Armas;

public class FusilDeAsaltoJoseMarquez extends ArmaJoseMarquez{

    public boolean silenciador;
    public FusilDeAsaltoJoseMarquez(){
        super();
        modelo = "Carabina M4";
        silenciador = false;
    }

    //
    public FusilDeAsaltoJoseMarquez(String modelo, int municion_maxima, int municion_actual, int rareza, boolean silenciador){
        this.modelo = modelo;
        this.municionMaximaCargador = municionMaximaCargador;
        this.municionActualCargador = municionActualCargador;
        this.rareza = rareza;
        this.silenciador = silenciador;
    }

    public boolean isSilenciador() {
        return silenciador;
    }

    public void setSilenciador(boolean silenciador) {
        if(silenciador!=true||silenciador!=false){
            throw new IllegalArgumentException("El valor de silenciador sólo puede ser true o false.");
        } else {
            this.silenciador = silenciador;
        }
    }

    @Override
    public String toString(){
        return RAREZAS[rareza] + "        |\\_______________ (_____\\\\______________\n" +
                "HH======#H###############H#######################\n" +
                "        ' ~\"\"\"\"\"\"\"\"\"\"\"\"\"\"`##(_))#H\\\"\"\"\"\"Y########\n" +
                "                          ))    \\#H\\       `\"Y###\n" +
                "                          \"      }#H)" + "\n" + RESET +
                modelo + (silenciador ? "(Con" : "(Sin") + " Silenciador)\t\t\t" + municionActualCargador + " / "
                + municionMaximaCargador + "\n";
    }

    @Override
    public void disparar() {
        if(silenciador){
            System.out.println("Rititititi rititititi");
        } else {
            System.out.println("Ratatatata ratatatata");
        }
    }
}
