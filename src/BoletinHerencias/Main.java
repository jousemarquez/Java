package BoletinHerencias;

import javax.naming.OperationNotSupportedException;

public class Main {

    public static void main(String[] args) {

        // Probando todos los métodos y constructores

        Elfos elfo1;
        try {
            elfo1 = new Elfos(null,"aaa", "jajsldlma");
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            elfo1 = new Elfos("Andandill", "Erundil", "Caza Morsas");
        }

        elfo1.dispararArco("Pablo");
        elfo1.hacerEncantamiento("Pablo");

        Enanos enano1;
        try {
            enano1 = new Enanos(null, null, null);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            enano1 = new Enanos("Forjaz", "Roble", "Mataorcos");
        }

        enano1.usarHacha("Pablo");
        enano1.crearArmadura("Armadura de Cobre");

        HombreMortal hombre1;

        try{
            hombre1 = new HombresMortales(null, null, null);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            hombre1 = new HombresMortales("Anduin", "Lion", "Rey de Ventormenta");
        }

        hombre1.morir();

        try {
            hombre1.usarEspada("Pablito");
        } catch (OperationNotSupportedException e){
            e.printStackTrace();
        }

        Orcos orco1;
        try {
            orco1 = new Orcos(null,"aaa", "jajsldlma");
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            orco1 = new Orcos("Andandill", "Erundil", "Caza Morsas");
        }

        Hobbits hobbit1;
        try {
            hobbit1 = new Hobbits(null,"aaa", "jajsldlma");
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            hobbit1 = new Hobbits("Andandill", "Erundil", "Caza Morsas");
        }

        hobbit1.fumarPipa();
        hobbit1.comer();
        hobbit1.dispararArco("Pablito");
        hobbit1.lanzarPiedra("Pablito");

        Hobbits hobbit2 = new Hobbits("Andandill", "Erundil", "Caza Morsas");
        System.out.println("Son iguales?: " + hobbit1.equals(hobbit2));
    }
}
