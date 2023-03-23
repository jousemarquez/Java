package herencias.boletinherencias1;

import java.util.Objects;

public abstract class BeingMiddleEarth {

    /*
    Ejercicio 1: todas las razas humanoides de Tolkien (elfos, enanos, hombres, orcos y
    hobbits) descienden de un ancestro común que llegó a la Tierra Media y era capaz de
    hablar y moverse. Los seres de esta raza inicial tenían un Name que los identificaba a
    cada uno de ellos y los distinguía del resto. También tenían un apellido y un handle. Cree
    una clase BeingMiddleEarth que modele la raza inicial (y solo la raza inicial). Los métodos
    para hablar y moverse no devuelven nada, y reciben una cadena de texto con la frase que
    se quiere decir y el lugar al que se quiere mover.
    */

    String name;
    String lastName;
    String handle;

    public BeingMiddleEarth(){
        name = "";
        lastName = "";
        handle = "";
    }

    public BeingMiddleEarth(String name, String lastName, String handle) {
        validateName(name);
        this.name = name;
        validateLastName(lastName);
        this.lastName = lastName;
        validateHandle(handle);
        this.handle = handle;
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

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        validateHandle(handle);
        this.handle = handle;
    }

    void validateName(String name){
        if (name == null){
            throw new IllegalArgumentException("Null names are not supported.");
        }
    }

    void validateLastName(String lastName){
        if (lastName == null){
            throw new IllegalArgumentException("Null lastnames are not supported.");
        }
    }

    void validateHandle(String handle){
        if (handle == null){
            throw new IllegalArgumentException("Null handle are not supported.");
        }

        if (handle.length() <= name.length()){
            throw new IllegalArgumentException("Handle must be shorter than name.");
        }
    }

    // Se genera el toString SIEMPRE por defecto
    @Override
    public String toString() {
        return "BeingMiddleEarth{" +
                "Name='" + name + '\'' +
                ", Lastname='" + lastName + '\'' +
                ", Handle='" + handle + '\'' +
                '}';
    }

    // Se genera el equal SIEMPRE por defecto

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BeingMiddleEarth that = (BeingMiddleEarth) o;
        /*Se modifica el return solo a Name porque en el ejercicio indica
        "Los seres de esta raza inicial tenían un Name que los identificaba a
        cada uno de ellos y los distinguía del resto."
        */
        return Objects.equals(name, that.name);
    }

    public void speak(String phrase){
        System.out.println(name + " says: " + phrase);
    }

    public void move(String position){
        System.out.println(name + " has move to " + position);
    }
}