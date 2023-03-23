package regex.boletincrossword;

import java.util.Arrays;
import java.util.Scanner;

public class CrosswordJoseMarquez {

    private String[] col = {"[JUNDT]*", "APA|OPI|OLK", "(NA|FE|HE)[CV]"};
    private String[] row = {"[DEF][MNO]*", "[^DJNU]P[ABC]", "[ICAN]*"};
    private char[][] sol = {{'D', 'O', 'N'}, {'T', 'P', 'A'}, {'N', 'I', 'C'} };
    private int maxLen;

    // Must generate an empty constructor whose default values will be:

    public CrosswordJoseMarquez() {
        String[] col = {"."};
        String[] row = {"."};
        char[][] sol = new char[1][1];
        int maxLen = 1;
    }

     /*
     You must also generate another constructor that receives the row and col data and initializes sol as an nxm array.
     where n is the length of row and m is the length of col.
     The maxLen attribute will be given by the maxLong() method.
     that will be requested in later sections (for now you can put it as 1).
     */

    public CrosswordJoseMarquez(String[] col, String[] row, char[][] sol, int maxLen) {
        validateCol(col);
        this.col = col;
        validateRow(row);
        this.row = row;
        validateSol(sol);
        this.sol = new char[row.length][col.length];
        validateMaxLen(maxLen);
        this.maxLen = 1;
    }

    // Setter method for the sol field only.
    public void setSol(char[][] sol) {
        this.sol = sol;
    }

    // Validators
    private void validateCol(String[] col) {
        if (col == null) {
            throw new IllegalArgumentException("The array cannot be null.");
        }
    }

    private void validateRow(String[] row) {
        if (row == null) {
            throw new IllegalArgumentException("The array cannot be null.");
        }
    }

    private void validateSol(char[][] sol) {
        if (sol == null) {
            throw new IllegalArgumentException("The array cannot be null.");
        }

    }

    private void validateMaxLen(int maxLen){
        if (maxLen < 0) {
            throw new ArithmeticException("Max Len can't be negative.");
        }
    }
    /*
    maxLong() method receives nothing and returns an integer. This method will loop through both the row attribute and
    the col attribute and will return the length of the longest String. It will be used in the constructor with data.
    */

    private int maxLong(){
        int lengthRow = 0;
        int lengthCol = 0;
        for (int i = 0; i < row.length; i++) {
            lengthRow++;
        }
        for (int i = 0; i < col.length; i++) {
            lengthCol++;
        }
        if (lengthRow > lengthCol){
            return lengthRow;
        } else {
            return lengthCol;
        }
    }

    /*
    Extend method that receives a String str and returns the String resulting from concatenating the following:
     - The repetition of the white space “ ” a total of (maxLen - length of str) times
     - The string itself str
     - The string “ |”
    */

    private String extend(String str) {
        int strLength = str.length();
        if (strLength >= maxLen) {
            return str + " |";
        }
        int numSpaces = maxLen - strLength;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numSpaces; i++) {
            sb.append(" ");
        }
        sb.append(str);
        sb.append(" |");
        return sb.toString();
    }

    /*
    joinSol() method that does not receive or return anything and that will ask the user on the screen
    to enter the character that he considers to be in each of the positions.
    */

    public void joinSolution() {
        Scanner input = new Scanner(System.in);
        // Ask the user to add the character in each array position.
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[i].length; j++) {
                System.out.printf("Enter the character for position [%d][%d]: ", i, j);
                char c = input.next().charAt(0);
                sol[i][j] = c;
            }
        }
        System.out.println("Solution matrix updated.");
    }

    /*
    checkSolution() method that receives nothing and returns a boolean resulting from checking if the solution is
    correct.
    That is, that the word that forms the characters located in row i complies with the regex located in row[i]
    and the word that forms the characters located in row j complies with the regex located in col[j].
    */

    public boolean checkSolution(){
        boolean solutionChecked = false;
        // falta
        return solutionChecked;
    }

    // Método borrarSol() que inicializa de nuevo el atributo sol.
    public void deleteSolution(){
        joinSolution();
    }

    static void Scanner() {
        Scanner scan = new Scanner(System.in);
    }

    @Override
    public String toString() {
        return "CrosswordJoseMarquez{" +
                "col=" + Arrays.toString(col) +
                ", row=" + Arrays.toString(row) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CrosswordJoseMarquez that = (CrosswordJoseMarquez) o;

        if (maxLen != that.maxLen) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(col, that.col)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(row, that.row)) return false;
        return Arrays.deepEquals(sol, that.sol);
    }

}