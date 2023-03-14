package Armas;

public class JoseAntonioMarquezFlores {
    public static void main(String[] args) {

        // Testeo inicio
        ArmaJoseMarquez ArmaJoseMarquez1 = null;
        try {
            ArmaJoseMarquez1 = new ArmaJoseMarquez(null, -23, -11, -4);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            ArmaJoseMarquez1 = new ArmaJoseMarquez();
        }
        ArmaJoseMarquez1.setRareza(4);

        FusilDeAsaltoJoseMarquez FusilDeAsaltoJoseMarquez1;
        try {
            FusilDeAsaltoJoseMarquez1 = new FusilDeAsaltoJoseMarquez(null, -21, -22,
                    20, true);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            FusilDeAsaltoJoseMarquez1 = new FusilDeAsaltoJoseMarquez();
        }
        FusilDeAsaltoJoseMarquez1.setRareza(3);
        FusilDeAsaltoJoseMarquez1.setSilenciador(true);

        EscopetaJoseMarquez EscopetaJoseMarquez1;
        try {
            EscopetaJoseMarquez1 = new EscopetaJoseMarquez(null, -45, -2, -2,
                    true);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            EscopetaJoseMarquez1 = new EscopetaJoseMarquez();
        }
        EscopetaJoseMarquez1.setRareza(2);
        // Testeo final


        ArmaJoseMarquez[] arrayArmas = {
                new ArmaJoseMarquez(),
                new EscopetaJoseMarquez(),
                new FusilDeAsaltoJoseMarquez()
        };

        InventarioJoseMarquez miArmeria = new InventarioJoseMarquez (arrayArmas);

        MetodosEstaticosDeJoseMarquez.imprimirInventario(miArmeria);
    }
}