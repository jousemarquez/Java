package herencias.boletinherencias1;

import javax.naming.OperationNotSupportedException;

public class Main {

    public static void main(String[] args) {

        // Checking each method and constructor.

        Elves elf1;
        try {
            elf1 = new Elves(null,"aaa", "jajsldlma");
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            elf1 = new Elves("Andandill", "Erundil", "Caza Morsas");
        }

        elf1.useBow("Pablo");
        elf1.castEnchanment("Pablo");

        Dwarfs dwarf1;
        try {
            dwarf1 = new Dwarfs(null, null, null);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            dwarf1 = new Dwarfs("Forjaz", "Roble", "MataOrcs");
        }

        dwarf1.useAxe("Pablo");
        dwarf1.forgeArmour("Mithril Armour");

        MortalMen man1;

        try{
            man1 = new MortalMen(null, null, null);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            man1 = new MortalMen("Anduin", "Lion", "Stormwind King");
        }

        man1.die();

        try {
            man1.useSword("Pablito");
        } catch (OperationNotSupportedException e){
            e.printStackTrace();
        }

        Orcs orc1;
        try {
            orc1 = new Orcs(null,"aaa", "jajsldlma");
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            orc1 = new Orcs("Andandill", "Erundil", "Caza Morsas");
        }

        Hobbits hobbit1;
        try {
            hobbit1 = new Hobbits(null,"aaa", "jajsldlma");
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            hobbit1 = new Hobbits("Andandill", "Erundil", "Caza Morsas");
        }

        hobbit1.smokePipe();
        hobbit1.eat();
        hobbit1.useBow("Pablito");
        hobbit1.throwStone("Pablito");

        try{
            hobbit1.useSword("Pablito");
        } catch (OperationNotSupportedException e) {
            e.printStackTrace();
            System.out.println("Hobbits can't use swords.");
        }

        Hobbits hobbit2 = new Hobbits("Andandill", "Erundil", "Caza Morsas");
        System.out.println("Son iguales?: " + hobbit1.equals(hobbit2));
    }
}