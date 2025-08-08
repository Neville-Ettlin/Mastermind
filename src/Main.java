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
            0 = Blau
            1 = Rot
            2 = Grün
            3 = Gelb
            4 = Orange
            5 = Violet
             */

            //Generation Computer Farben

            int a = 0;
            int ab = 0;
            int abc = 0;
            int abcd = 0;

            int farbe1_Com_random = 0;
            int farbe2_Com_random = 0;
            int farbe3_Com_random = 0;
            int farbe4_Com_random = 0;

            String farbe1_Com = "";
            String farbe2_Com = "";
            String farbe3_Com = "";
            String farbe4_Com = "";

            for (int i = 0; i <= 4; i++) {
                Random random = new Random();
                int randomZahl = random.nextInt(6);

                if (a == 0) {
                    farbe1_Com_random = randomZahl;
                    ++a;
                } else if (ab == 0) {
                    farbe2_Com_random = randomZahl;
                    ++ab;
                } else if (abc == 0) {
                    farbe3_Com_random = randomZahl;
                    ++abc;
                } else if (abcd == 0) {
                    farbe4_Com_random = randomZahl;
                    ++abcd;
                }
            }

            //Farb zuweisung Farbe1_Com
                switch (farbe1_Com_random) {
                    case 0:
                        farbe1_Com = "Blau";
                        break;
                    case 1:
                        farbe1_Com = "Rot";
                        break;
                    case 2:
                        farbe1_Com = "Grün";
                        break;
                    case 3:
                        farbe1_Com = "Gelb";
                        break;
                    case 4:
                        farbe1_Com = "Orange";
                        break;
                    case 5:
                        farbe1_Com = "Violet";
                        break;

                    default:
                        System.out.println("error");
                        break;
                }

            //Farb zuweisung Farbe2_Com
                switch (farbe2_Com_random) {
                    case 0:
                        farbe2_Com = "Blau";
                        break;
                    case 1:
                        farbe2_Com = "Rot";
                        break;
                    case 2:
                        farbe2_Com = "Grün";
                        break;
                    case 3:
                        farbe2_Com = "Gelb";
                        break;
                    case 4:
                        farbe2_Com = "Orange";
                        break;
                    case 5:
                        farbe2_Com = "Violet";
                        break;

                    default:
                        System.out.println("error");
                        break;
                }

            //Farb zuweisung Farbe3_com
                switch (farbe3_Com_random) {
                    case 0:
                        farbe3_Com = "Blau";
                        break;
                    case 1:
                        farbe3_Com = "Rot";
                        break;
                    case 2:
                        farbe3_Com = "Grün";
                        break;
                    case 3:
                        farbe3_Com = "Gelb";
                        break;
                    case 4:
                        farbe3_Com = "Orange";
                        break;
                    case 5:
                        farbe3_Com = "Violet";
                        break;

                    default:
                        System.out.println("error");
                        break;
                }

            //Farb zuweisung Farbe4_com
            switch (farbe4_Com_random) {
                case 0:
                    farbe4_Com = "Blau";
                    break;
                case 1:
                    farbe4_Com = "Rot";
                    break;
                case 2:
                    farbe4_Com = "Grün";
                    break;
                case 3:
                    farbe4_Com = "Gelb";
                    break;
                case 4:
                    farbe4_Com = "Orange";
                    break;
                case 5:
                    farbe4_Com = "Violet";
                    break;

                default:
                    System.out.println("error");
                    break;
            }

                System.out.println(farbe2_Com);
                System.out.println(farbe1_Com);
                System.out.println(farbe3_Com);
                System.out.println(farbe4_Com);


                }

            }
