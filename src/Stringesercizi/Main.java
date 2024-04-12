package Stringesercizi;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String test = "wowowo";
        System.out.println(test);

        System.out.println("lunghezza: " + test.length());
        System.out.println("Maiuscole: " + test.toUpperCase());
        System.out.println("minuscole: " + test.toLowerCase());

        String[] array = test.split("");
        System.out.println("array:" + Arrays.toString(array));
        System.out.println("numero di parole: " + array.length);

    }
}
