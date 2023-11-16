import java.lang.Math;
import java.util.Random;

public class Homework5 {
    public static void main(String[] args) {
//        1) scrieti o functie care primeste un sir de numere intregi si returneaza suma lor
        int[] numbers = {10, 4, 32, 9, 51};
        int sum = 0;
        int i;
        for (i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum is: " + sum);
        System.out.println("---------------------");
//        2) scrieti o functie care primeste un sir de numere intregi si returneaza numarul de elemente impare
        System.out.println("Odd Numbers:");
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }
        System.out.println("---------------------");
//        3) scrieti o functie care primeste un sir de numere intregi si un alt numar intreg. Returnati toate numerele mai mari decat numarul primit
        int anotherNr = 25;
        System.out.println("Numbers bigger than " + anotherNr);
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] > anotherNr) {
                System.out.println(numbers[i]);
            }
        }
        System.out.println("---------------------");
//        4) scrieti o functie care primeste un numar intreg reprezentand targetul de donatii.
//        Donatiile se vor face cu ajutorul obiectului Random.
//        Primim donatii pana cand ajungem la suma dorita.
//        Cand ajungem la suma dorita afisam un mesaj de succes.

        Random rand = new Random();
        int target = 0;

        while (target <= 1000) {
            int donation = rand.nextInt(1, 1000);
            System.out.println("Donation: " + donation);
            target += donation;
            System.out.println("Ammount reached: " + target);
        }
        System.out.println("---------------------");

//        5) rescrieti functia de la 4 cu urmatoarea modificare: functia va primi si un numar maxim de donatii. Cand acesta se termina, campania se va incheia
        target = 0;
        for (i = 0; i <= 10; i++) {
            int donation = rand.nextInt(1, 1000);
            if (target <= 5000) {
                System.out.println("Donation: " + donation);
                target += donation;
                System.out.println("Ammount reached: " + target);
            }
            if (target < 5000 && i == 10) {
                System.out.println("Failed to reach donation target. Ammount reached: " + target);
            }
        }
        System.out.println("---------------------");
//        6) scrieti o functie care primeste un string cu o fraza (mai multe propozitii despartite prin punct). Printati fiecare propozitie pe o linie noua
        String paragraph = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. ";
        String sentences[] = paragraph.split("[.]");
        for (String sentence : sentences) {
            System.out.println(sentence);
        }

    }
}

