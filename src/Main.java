import java.util.Random;
    public class Main {
        public static void main(String[] args) {
            System.out.println("Sie haben das Spiel angefangen");
            //Generiert Random Zahl und definiert 4 Variablen

            System.out.println("Herzlich Willkommen zu Mastermind");
            System.out.println("Ihre Aufgabe ist die Farben zu erraten. Insgesamt haben Sie 12 Versuche die 4 richtige Farben zu finden.");
            System.out.println("Die mögliche Farben sind: Rot, Grün, Blau, Orange, Gelb, Weis, Grau und Rosa.");
            System.out.println("Viel Glück!!");

            /*
            1 = Rot
            2 = Grün
            3 = Blau
            4 = Orange
            5 = Gelb
            6 = Weis
            7 = Grau
            8 = Rosa
             */

            int a = 0;
            int ab = 0;
            int abc = 0;
            int abcd



            for (int i = 0; i <= 4; i++) {
                Random random = new Random();
                int randomZahl = random.nextInt(8);

                if (a == 0) {
                    int Farbe1_Com = a;
                    ++a;
                } else if (ab == 0) {
                     int a2 = a;
                    ++ab;
                } else if (abc == 0) {
                    a3 = a;
                    ++abc;
                }
            }
            }
        }