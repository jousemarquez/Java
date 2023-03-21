package BoletinHerencias;

import java.util.Objects;

public abstract class SerTierraMedia {

    /*
    Ejercicio 1: todas las razas humanoides de Tolkien (elfos, enanos, hombres, orcos y
    hobbits) descienden de un ancestro común que llegó a la Tierra Media y era capaz de
    hablar y moverse. Los seres de esta raza inicial tenían un nombre que los identificaba a
    cada uno de ellos y los distinguía del resto. También tenían un apellido y un apodo. Cree
    una clase SerTierraMedia que modele la raza inicial (y solo la raza inicial). Los métodos
    para hablar y moverse no devuelven nada, y reciben una cadena de texto con la frase que
    se quiere decir y el lugar al que se quiere mover.
    */

    public String nombre;
    public String apellido;
    public String apodo;

    public SerTierraMedia(){
        nombre = "";
        apellido = "";
        apodo = "";
    }

    public SerTierraMedia(String nombre, String apellido, String apodo) {
        validateNombre(nombre);
        this.nombre = nombre;
        validateApellido(apellido);
        this.apellido = apellido;
        validateApodo(apodo);
        this.apodo = apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        validateNombre(nombre);
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        validateApellido(apellido);
        this.apellido = apellido;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        validateApodo(apodo);
        this.apodo = apodo;
    }

    void validateNombre(String nombre){
        if (nombre == null){
            throw new IllegalArgumentException("No se permiten nombres nulos.");
        }
    }

    void validateApellido(String apellido){
        if (apellido == null){
            throw new IllegalArgumentException("No se permiten apellidos nulos.");
        }
    }

    void validateApodo(String apodo){
        if (apodo == null){
            throw new IllegalArgumentException("No se permiten apodos nulos.");
        }

        if (apodo.length() > nombre.length()){
            throw new IllegalArgumentException("No tiene sentido apodo más largo que nombre");
        }
    }



    // Se genera el toString SIEMPRE por defecto
    @Override
    public String toString() {
        return "SerTierraMedia{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", apodo='" + apodo + '\'' +
                '}';
    }

    // Se genera el equal SIEMPRE por defecto

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SerTierraMedia that = (SerTierraMedia) o;
        /*Se modifica el return solo a NOMBRE porque en el ejercicio indica
        "Los seres de esta raza inicial tenían un nombre que los identificaba a
        cada uno de ellos y los distinguía del resto."
        */
        return Objects.equals(nombre, that.nombre);
    }
}