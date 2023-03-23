package herencias.boletinherencias4;

import java.util.regex.*;

public class Grandpa {

    String birthday;
    char sex;
    String name;
    String lastName;

    public Grandpa() {
        birthday = "";
        name = "";
        lastName = "";
    }

    public Grandpa(String birthday, char sex, String name, String lastName) {
        validateBirthday(birthday);
        this.birthday = birthday;
        validateSex(sex);
        this.sex = sex;
        validateName(name);
        this.name = name;
        validateLastName(lastName);
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        validateBirthday(birthday);
        this.birthday = birthday;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        validateSex(sex);
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        validateName(name);
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        validateLastName(lastName);
        this.lastName = lastName;
    }

    void validateBirthday(String birthday) throws PatternSyntaxException {
        if (birthday == null) {
            throw new IllegalArgumentException("Null birthdates are not supported");
        }
        String regex = "^(0[1-9]|[1-2][0-9]|3[0-1])[.-/](0[1-9]|1[0-2])[.-/]([0-9]{2}|[0-9]{4})$";
        String regexFebruary = "^(1[2-3]|2[0-9]|3[0-1])[.-/](0[1-9]|1[0-2])[.-/]([0-9]{2}|[0-9]{4})$";
        String regexRicardo = "^((0[1-9]|[12]\\d|3[01])[/](0[1-9]|1[0-2])[/]\\d{4})\"$";
        /*
        * (0[1-9]|[12]\d|3[01]) representa los días, donde:
        0[1-9] coincide con días del 01 al 09.
        [12]\d coincide con días del 10 al 29.
        3[01] coincide con días del 30 al 31.
        [/] representa el separador de fecha.
        (0[1-9]|1[0-2]) representa los meses, donde:
        0[1-9] coincide con meses del 01 al 09.
        1[0-2] coincide con meses del 10 al 12.
        [/] representa el separador de fecha.
        \d{4} representa los cuatro dígitos numéricos para el año.*/
        if (!birthday.matches(regex) || birthday.matches(regexFebruary)) {
            throw new IllegalArgumentException("Birthdate format is not supported.");
        }
    }

    void validateName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Null names are not supported");
        }
    }

    void validateLastName(String lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException("Null Last Names are not supported.");
        }
    }

    void validateSex(char sex) {
        if ((sex != 'M' || sex != 'F')) {
            throw new IllegalArgumentException("Sex selected must be (F)emale or (M)ale.");
        }
    }

    public void storytelling(String story) {
        System.out.println(name + " has started a new " + story);
    }

    @Override
    public String toString() {
        return "Grandpa{" +
                "birthday='" + birthday + '\'' +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}