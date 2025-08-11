import com.sun.source.tree.IfTree;

import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Herzlich Willkommen zu Mastermind");
        System.out.println("Kennen Sie das Spiel Mastermind? Ja / Nein");

        Scanner newScanner = new Scanner(System.in);
        String Antwort = newScanner.nextLine();

        if (Objects.equals(Antwort.toLowerCase() , "ja")) {
            System.out.println("Sie haben das Spiel angefangen");
        } else {
            System.out.println("Ihre Aufgabe ist die Farben zu erraten. Insgesamt haben Sie 12 Versuche die 4 richtige Farben zu finden.");
        }
        System.out.println("Die mögliche Farben sind: Blau, Rot, Grün, Gelb, Orange, Violet.");
        System.out.println("Viel Glück!!");

        Random rand = new Random();
        Set<Integer> uniqueNumbers = new HashSet<>();

        while (uniqueNumbers.size() < 4) {
            int number = rand.nextInt(6);
            uniqueNumbers.add(number);
        }
        List<Integer> numberList = new ArrayList<>(uniqueNumbers);

        int[] random_list = new int[4];
        String[] generiert = new String[4];

        for (int h = 0; h <= 3; h++) {
            random_list[h] = numberList.get(h);
        }

        for (int m = 0; m <= 3; m++) {

            switch (random_list[m]) {
                case 0:
                    generiert[m] = "Blau";
                    break;
                case 1:
                    generiert[m] = "Rot";
                    break;
                case 2:
                    generiert[m] = "Grün";
                    break;
                case 3:
                    generiert[m] = "Gelb";
                    break;
                case 4:
                    generiert[m] = "Orange";
                    break;
                case 5:
                    generiert[m] = "Violet";
                    break;
            }
        }
        int versuche = 12;
        for (int i = 0; i <= 12; i++) {
            if (versuche == 1) {
                System.out.println("Sie haben noch" + " " + versuche + " " + "Versuch");
            } else {
                System.out.println("Sie haben noch" + " " + versuche + " " + "Versuche");
                versuche--;
            }

            System.out.println("Geben Sie ihre Farben ein (Blau, Rot, etc.): ");

            String[] userValue = new String[4];

            String input = newScanner.nextLine();
            String[] arrOfStr = input.split(", ");

            for (int o = 0; o <= 3; o++) {
                for (String x : arrOfStr) {
                    userValue[o] = x.toLowerCase() ;
                    o++;
                }
            }

            int FarbeRichtig = 0;
            int FarbenPosition = 0;
            int FarbenFalsch = 0;

            for (int f = 0; f <= 3; f++) {
                if (Objects.equals(userValue[f], generiert[f])) {
                    FarbeRichtig++;
                }
            }

            for (int t = 0; t <= 3; t++) {
                for (int q = 0; q <= 3; q++) {
                    if (Objects.equals(userValue[q], generiert[t])) {
                        FarbenPosition++;
                    }
                }
            }

            FarbenPosition = FarbenPosition - FarbeRichtig;
            FarbenFalsch = 4 - FarbenPosition - FarbeRichtig;


            if (FarbeRichtig == 4) {
                System.out.println("Du hast gewonnen!");
                System.exit(1);
            }

            System.out.println(FarbeRichtig + " Farbe/n sind richtig");
            System.out.println(FarbenPosition + " Farbe/n sind am falschen Ort");
            System.out.println(FarbenFalsch + " Farbe/n sind falsch");

            if (i == 12) {
                System.out.println("Die richtigen Farben waren:");
                System.out.println(Arrays.toString(generiert));
                System.exit(1);
            }
        }
    }
}