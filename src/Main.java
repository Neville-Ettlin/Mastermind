import com.sun.source.tree.IfTree;

import java.util.*;

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
                System.out.println("Die mögliche Farben sind: Blau, Rot, Grün, Gelb, Orange, Violet.");
            } else {
                System.out.println("Ihre Aufgabe ist die Farben zu erraten. Insgesamt haben Sie 12 Versuche die 4 richtige Farben zu finden.");
                System.out.println("Die mögliche Farben sind: Blau, Rot, Grün, Gelb, Orange, Violet.");
                System.out.println("Viel Glück!!");
            }






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

            Random rand = new Random();
            Set<Integer> uniqueNumbers = new HashSet<>();

            while (uniqueNumbers.size() < 4) {
                int number = rand.nextInt(6); // Zahlenbereich: 0 bis 5
                uniqueNumbers.add(number); // Duplikate werden automatisch ignoriert
            }
            List<Integer> numberList = new ArrayList<>(uniqueNumbers);

            // In Variablen speichern
            int y = numberList.get(0);
            int b = numberList.get(1);
            int c = numberList.get(2);
            int d = numberList.get(3);


            farbe1_Com_random = y;
            farbe2_Com_random = b;
            farbe3_Com_random = c;
            farbe4_Com_random = d;



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
                    System.out.println("error!");
                    break;
            }


            int versuche = 12;


            for (int i = 0; i <= 12; i++ ) {

                if (i == 12) {
                    System.out.println("Die richtigen Farben waren:");
                    System.out.println(farbe1_Com);
                    System.out.println(farbe2_Com);
                    System.out.println(farbe3_Com);
                    System.out.println(farbe4_Com);
                    System.exit(1);
                }

                if (versuche == 1) {
                    System.out.println("Sie haben noch" + " " + versuche + " " + "Versuch");
                } else {
                    System.out.println("Sie haben noch" + " " + versuche + " " + "Versuche");
                    versuche = versuche - 1;
                }

                System.out.println("Geben Sie ihre Farben einzeln ein:");


                // User gibt seine Varianten an

                Scanner FarbeScanner = new Scanner(System.in);
                String userValue1 = FarbeScanner.nextLine();
                String userValue2 = FarbeScanner.nextLine();
                String userValue3 = FarbeScanner.nextLine();
                String userValue4 = FarbeScanner.nextLine();


                int FarbeRichtig = 0;
                int FarbenPosition = 0;
                int FarbenFalsch = 0;


                if (Objects.equals(userValue1, farbe1_Com)) {
                    FarbeRichtig = FarbeRichtig + 1;
                } else if (Objects.equals(userValue1, farbe2_Com)) {
                    FarbenPosition = FarbenPosition + 1;
                } else if (Objects.equals(userValue1, farbe3_Com)) {
                    FarbenPosition = FarbenPosition + 1;
                } else if (Objects.equals(userValue1, farbe4_Com)) {
                    FarbenPosition = FarbenPosition + 1;
                } else {
                    FarbenFalsch = FarbenFalsch + 1;
                }

                if (Objects.equals(userValue2, farbe2_Com)) {
                    FarbeRichtig = FarbeRichtig + 1;
                } else if (Objects.equals(userValue2, farbe1_Com)) {
                    FarbenPosition = FarbenPosition + 1;
                } else if (Objects.equals(userValue2, farbe3_Com)) {
                    FarbenPosition = FarbenPosition + 1;
                } else if (Objects.equals(userValue2, farbe4_Com)) {
                    FarbenPosition = FarbenPosition + 1;
                } else {
                    FarbenFalsch = FarbenFalsch + 1;
                }

                if (Objects.equals(userValue3, farbe3_Com)) {
                    FarbeRichtig = FarbeRichtig + 1;
                } else if (Objects.equals(userValue3, farbe2_Com)) {
                    FarbenPosition = FarbenPosition + 1;
                } else if (Objects.equals(userValue3, farbe1_Com)) {
                    FarbenPosition = FarbenPosition + 1;
                } else if (Objects.equals(userValue3, farbe4_Com)) {
                    FarbenPosition = FarbenPosition + 1;
                } else {
                    FarbenFalsch = FarbenFalsch + 1;
                }

                if (Objects.equals(userValue4, farbe4_Com)) {
                    FarbeRichtig = FarbeRichtig + 1;
                } else if (Objects.equals(userValue4, farbe2_Com)) {
                    FarbenPosition = FarbenPosition + 1;
                } else if (Objects.equals(userValue4, farbe3_Com)) {
                    FarbenPosition = FarbenPosition + 1;
                } else if (Objects.equals(userValue4, farbe1_Com)) {
                    FarbenPosition = FarbenPosition + 1;
                } else {
                    FarbenFalsch = FarbenFalsch + 1;
                }

                if (FarbeRichtig == 0) {
                    System.out.println(" ");
                } else if (FarbeRichtig == 1) {
                    System.out.println("Eine Farbe ist richtig");
                } else if (FarbeRichtig == 2) {
                    System.out.println("Zwei Farben sind richtig");
                } else if (FarbeRichtig == 3) {
                    System.out.println("Drei Farben sind richtig");
                } else {
                    System.out.println("Du hast gewonnen!");
                    System.exit(1);
                }

                if (FarbenFalsch == 0) {
                    System.out.println("Keine Farben sind falsch");
                } else if (FarbenFalsch == 1) {
                    System.out.println("Eine Farbe ist falsch");
                } else if (FarbenFalsch == 2) {
                    System.out.println("Zwei Farben sind falsch");
                } else if (FarbenFalsch == 3) {
                    System.out.println("Drei Farben sind falsch");
                } else {
                    System.out.println("Alle Farben sind falsch");
                }

                if (FarbenPosition == 0) {
                    System.out.println("Keine Farben haben falsche Position");
                } else if (FarbenPosition == 1) {
                    System.out.println("Eine Farbe hat falsche Position");
                } else if (FarbenPosition == 2) {
                    System.out.println("Zwei Farben haben falsche Position");
                } else if (FarbenPosition == 3) {
                    System.out.println("Drei Farben haben falsche Position");
                } else {
                    System.out.println("Alle Farben haben falsche Position");
                }

            }

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














        }

            }
