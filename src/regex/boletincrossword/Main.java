package regex.boletincrossword;

public class Main {

    public static void main(String[] args) {


        String[] col = {"[JUNDT]*","APA|OPI|OLK","(NA|FE|HE)[CV]" };
        String[] row = {"[DEF][MNO]*","[^DJNU]P[ABC]","[ICAN]*"};
        char[][] sol = {{'D','O','N'},{'T','P','A'},{'N','I','C'}};

        CrosswordJoseMarquez cr = new CrosswordJoseMarquez(col,row,sol,2);

        String[] col2 = {"UB|IE|AW","[TUBE]*","[BORF]." };
        String[] row2 = {"[NOTAD]*","WEL|BAL|EAR"};
        char[][] sol2 = {{'A','T','O'},{'W','E','L'}};

        CrosswordJoseMarquez cr2 = new CrosswordJoseMarquez(col2, row2, sol2, 5);

        String[] col3 = {"[BQW](PR|LE)","[RANK]+"};
        String[] row3 = {"[AWE]+","[ALP]+K","(PR|ER|EP)"};
        char[][] sol3 = {{'W','A'},{'L','K'},{'E','R'}};

        CrosswordJoseMarquez cr3 = new CrosswordJoseMarquez(col3, row3, sol3, 4);

        CrosswordJoseMarquez[] crs = {cr, cr2, cr3};

        cr.toString();
        cr2.toString();
        cr3.toString();
    }
}
