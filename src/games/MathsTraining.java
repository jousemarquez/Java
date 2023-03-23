package games;

import java.util.Scanner;

public class MathsTraining {
    public static void main (String [] arg){
        Scanner sc = new Scanner(System.in);
        String d = "\uD83E\uDDDE";
        String c = "\uD83D\uDC80";
        String start;
        long timeRecord = 0, startTime = 0, endTime = 0, time;
        int hitRecord = 0, score = 0, operations, result, num, num2;
        System.out.println("╔═══════════════════════════╗");
        System.out.println("║      MATHS TRAINING       ║");
        System.out.println("║      SINGLE PLAYER     ╔══╩═╗");
        System.out.println("║     by Jouse Márquez   ║ "+d+" ║");
        System.out.println("╚════════════════════════╩════╝");
        System.out.println("╔═══════════════════════════╗");
        System.out.println("║    Do you want to play?   ║");
        System.out.println("║          (Yes/No)         ║");
        System.out.println("╚═══════════════════════════╝");
        System.out.println("Answer: ");
        start = sc.next();

        while (start.equalsIgnoreCase ("Yes")){
            startTime = System.nanoTime();
            score = 0;
            boolean checker = true;
            System.out.println("╔═══════════════╗");
            System.out.println("║     READY,    ║");
            System.out.println("║ STEADY, GO!!  ║");
            System.out.println("╚═══════════════╝");

            while (checker) {

                operations = (int) (Math.random() * 4);
                num = (int) (Math.random() * 101);
                num2 = (int) (Math.random() * 101);

                switch (operations) {
                    case 0:
                        System.out.println("╔═══════════════════╗");
                        System.out.println("║    CHALLENGE #1   ║");
                        System.out.println("║   SUM OPERATION   ║");
                        System.out.println("╚═══════════════════╝");
                        System.out.print(num + " + " + num2+" = ");
                        result = sc.nextInt();

                        if ((num + num2) == result) {
                            score++;
                            System.out.println("RIGHT!");
                        } else {
                            endTime = System.nanoTime();
                            checker = false;
                        }
                        break;
                    case 1:
                        System.out.println("╔═══════════════════════╗");
                        System.out.println("║      CHALLENGE #2     ║");
                        System.out.println("║ SUBTRACTION OPERATION ║");
                        System.out.println("╚═══════════════════════╝");
                        System.out.print(num + " - " + num2+" = ");
                        result = sc.nextInt();

                        if ((num - num2) == result) {
                            score++;
                            System.out.println("RIGHT!");
                        } else {
                            endTime = System.nanoTime();
                            checker = false;
                        }
                        break;
                    case 2:
                        System.out.println("╔══════════════════════════╗");
                        System.out.println("║       CHALLENGE #3       ║");
                        System.out.println("║ MULTIPLICATION OPERATION ║");
                        System.out.println("╚══════════════════════════╝");
                        System.out.print(num + " * " + num2+" = ");
                        result = sc.nextInt();

                        if ((num * num2) == result) {
                            score++;
                            System.out.println("RIGHT!");
                        } else {
                            endTime = System.nanoTime();
                            checker = false;
                        }
                        break;
                    case 3:
                        System.out.println("╔═══════════════════════╗");
                        System.out.println("║      CHALLENGE #4     ║");
                        System.out.println("║  DIVISION OPERATION   ║");
                        System.out.println("╚═══════════════════════╝");

                        if (num2 == 0){
                            num2++;
                        }
                        System.out.print(num + " % " + num2+" = ");
                        result = sc.nextInt();

                        if ((num / num2) == result) {
                            score++;
                            System.out.println("RIGHT!");
                        } else {
                            endTime = System.nanoTime();
                            checker = false;
                        }
                        break;
                }
            }
            time = (endTime - startTime)/ 1000000000;
            /*Fin de partida perdida. Muestra la puntuación del jugador y la duración en segundos.*/
            System.out.println("╔═══════════════════════════╗");
            System.out.println("║       GAME OVER"+c+"!        ║");
            System.out.println("║ Good game, here your hits!║");
            System.out.println("╚═══════════════════════════╝");
            System.out.println("╔═══════════╗");
            System.out.println("║   GAME    ║ "+score+" Hits.");
            System.out.println("║   SCORE   ║ Duration: "+time+" seconds.");
            System.out.println("╚═══════════╝");
            if (score > hitRecord){
                if (time > timeRecord){
                    score = hitRecord;
                    time = timeRecord;
                    // Fin de partida batiendo un récord nuevo.
                    System.out.println("╔═══════════════════════════╗");
                    System.out.println("║      CONGRATULATIONS!     ║");
                    System.out.println("║ You've SMASH the ranking! ║");
                    System.out.println("╚═══════════════════════════╝");
                    System.out.println("╔═══════════╗");
                    System.out.println("║   GAME    ║ "+hitRecord+" Hits.");
                    System.out.println("║   RECORD  ║ Duration: "+timeRecord+ " seconds.");
                    System.out.println("╚═══════════╝");
                }
            }
            // Pregunta al jugador si quiere volver a jugar una partida.
            System.out.println("╔═══════════════════════════════════╗");
            System.out.println("║ Do you want to play a next round? ║");
            System.out.println("║             (Yes/No)              ║");
            System.out.println("╚═══════════════════════════════════╝");
            System.out.println("Answer: ");
            start = sc.next();
        }
        // Partida finalizada SIN batir un nuevo récord.
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║        THANKS FOR PLAYING!      ║");
        System.out.println("╚═════════════════════════════════╝");
        System.out.println("╔═══════════╗");
        System.out.println("║   GAME    ║ "+hitRecord+" Hits.");
        System.out.println("║   RECORD  ║ Duration: "+timeRecord+" seconds");
        System.out.println("╚═══════════╝");
    }
}
