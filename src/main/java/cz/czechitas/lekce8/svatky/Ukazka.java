package cz.czechitas.lekce8.svatky;

import cz.czechitas.lekce8.losovani.LosovaciZarizeni;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ukazka {
    public static void main(String[] args) {
        List<String> dny = Arrays.asList("pondělí", "úterý", "středa", "čtvrtek", "pátek", "sobota", "neděle");

        for (String den:dny) {
            System.out.println(den);
        }

        //new Random().ints().forEach(cislo -> System.out.println(cislo));  nekonečný stream

//        dny.forEach(den -> {
//            System.out.println(den);
//            vypisDen(den);
//        });

        dny.forEach(Ukazka::vypisDen);

        new LosovaciZarizeni()
                .losujSeznamCisel(1, 6, 10)
                .forEach(cislo -> System.out.println(cislo));

    }

    private static void vypisDen(String den) {
        System.out.print("* ");
        System.out.println(den);
    }
}

