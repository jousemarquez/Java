import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class PracticaTimers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Crear un programa que lea por pantalla un numero entre 0 y 59, ambos incluidos y forzando\n" +
                "al usuario que esté dentro de ese rango. Tras ello, crear un timer de tipo cuenta atrás, que\n" +
                "comience presentando el numero introducido y lo vaya decrementando e imprimiendo en una\n" +
                "nueva línea. Tras imprimir el cero, el programa acaba imprimiendo la palabra FIN.");
        System.out.println("Introduce un número entre 0 y 59: ");
        int i = sc.nextInt();
        int num = sc.nextInt();
        do {
            System.out.println("Error. Introduce un número entre 0 y 59: ");
            int eje22 = sc.nextInt();
            int k = 1;
            for (int i = 0; i < eje22; i++) {
                System.out.println(k);
                k++;
            }
            System.out.println("FIN");
        } while (num > 0 || num < 59);
    }
}
/*import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class PracticaTimers extends JFrame {

    private static final long serialVersionUID = 3545053785228009472L;

    // GUI Components
    private JPanel panel;
    private JLabel timeLabel;

    private JPanel buttonPanel;
    private JButton startButton;
    private JButton resetButton;
    private JButton stopButton;

    // Properties of Program.
    private byte centiseconds = 0;
    private byte seconds = 30;
    private short minutes = 0;

    private DecimalFormat timeFormatter;

    private Timer timer;

    public PracticaTimers() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Consolas", Font.PLAIN, 13));
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(timeLabel);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                timer.start();

            }
        });
        buttonPanel.add(startButton);

        resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                timer.stop();

                centiseconds = 0;
                seconds = 30;
                minutes = 0;

                timeLabel.setText(timeFormatter.format(minutes) + ":"
                        + timeFormatter.format(seconds) + "."
                        + timeFormatter.format(centiseconds));
            }
        });

        buttonPanel.add(resetButton);

        stopButton = new JButton("Stop");
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });

        buttonPanel.add(stopButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        timeFormatter = new DecimalFormat("00");

        timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (centiseconds > 0) {
                    centiseconds--;
                } else {
                    if (seconds == 0 && minutes == 0) {
                        timer.stop();
                    } else if (seconds > 0) {
                        seconds--;
                        centiseconds = 99;
                    } else if (minutes > 0) {
                        minutes--;
                        seconds = 59;
                        centiseconds = 99;
                    }
                }
                timeLabel.setText(timeFormatter.format(minutes) + ":"
                        + timeFormatter.format(seconds) + "."
                        + timeFormatter.format(centiseconds));
            }
        });

        timeLabel.setText(timeFormatter.format(minutes) + ":"
                + timeFormatter.format(seconds) + "."
                + timeFormatter.format(centiseconds));

        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("StopwatchGUI.java");

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                new PracticaTimers();
            }
        });
    }
}*/