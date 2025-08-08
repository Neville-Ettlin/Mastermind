import com.sun.source.tree.IfTree;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            System.out.println("Herzlich Willkommen zu Mastermind");
            System.out.println("Kennen Sie das Spiel Mastermind? ");
            System.out.println("Antworten Sie mit 'Ja' oder 'Nein' ");
            String Ja = "Ja";

            Scanner newScanner = new Scanner(System.in);
            String Antwort = newScanner.nextLine();

            if (Objects.equals(Antwort, Ja)) {
                System.out.println("Sie haben das Spiel angefangen");
            } else {
                System.out.println("Ihre Aufgabe ist die Farben zu erraten. Insgesamt haben Sie 12 Versuche die 4 richtige Farben zu finden.");
                System.out.println("Die mögliche Farben sind: Rot, Grün, Blau, Orange, Gelb, Weis, Grau und Rosa.");
                System.out.println("Viel Glück!!");
            }




            //Generiert Random Zahl und definiert 4 Variablen




            /*
            0 = Rot
            1 = Grün
            2 = Blau
            3 = Orange
            4 = Gelb
            5 = Weis
            6 = Grau
            7 = Rosa
             */

            //Generation Computer Farben

            int a = 0;
            int ab = 0;
            int abc = 0;
            int abcd = 0;

            int farbe1_Com = 0;
            int farbe2_Com = 0;
            int farbe3_Com = 0;
            int farbe4_Com = 0;


            for (int i = 0; i <= 4; i++) {
                Random random = new Random();
                int randomZahl = random.nextInt(8);

                if (a == 0) {
                     farbe1_Com = randomZahl;
                    ++a;
                } else if (ab == 0) {
                      farbe2_Com = randomZahl;
                    ++ab;
                } else if (abc == 0) {
                     farbe3_Com = randomZahl;
                    ++abc;
                } else if (abcd == 0) {
                     farbe4_Com = randomZahl;
                    ++abcd;
                }

            }
            }
        }