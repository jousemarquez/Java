package herencias.boletinherencias4;

import javax.naming.OperationNotSupportedException;

public class Father extends Son {

    Grandpa grandpa1;
    Grandpa grandpa2;

    public Father(Grandpa grandpa1, Grandpa grandpa2) {
        this.grandpa1 = grandpa1;
        this.grandpa2 = grandpa2;
    }

    void darSermon() throws OperationNotSupportedException {

    }

    @Override
    public void contarBatallitas() throws OperationNotSupportedException {
        throw new OperationNotSupportedException("No es lo suficientemente mayor");
    }
}
