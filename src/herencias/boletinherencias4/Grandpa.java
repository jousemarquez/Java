package herencias.boletinherencias4;

import javax.naming.OperationNotSupportedException;
import java.util.Objects;
import java.util.regex.*;

public class Grandpa extends Father{

    String birthday, name, lastName;
    char sex;



    public void storytelling(String story) {
        System.out.println(name + " has started a new " + story);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "Grandpa{" +
                "birthday='" + birthday + '\'' +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grandpa grandpa = (Grandpa) o;

        if (sex != grandpa.sex) return false;
        if (!Objects.equals(birthday, grandpa.birthday)) return false;
        if (!Objects.equals(name, grandpa.name)) return false;
        return Objects.equals(lastName, grandpa.lastName);
    }

    public void contarBatallitas() throws OperationNotSupportedException {
        System.out.println("No veas la brasa que te voy a dar.");
    }
}