package be.ehb;

import java.util.Random;

public class BasisElementen {

    public static void main(String[] args) {

        /*
        Schrijf een programma met de naam WillekeurigGetal dat eenwillekeurig natuurlijk getal in het bereik [1,10] genereert.
        Mogelijke uitvoer:

        Willekeurig natuurlijk getal in het bereik [1,10]: 5
         */

        Random Random = new Random();

        int RandomNumber = Random.nextInt(10)+1;

        System.out.println("Willekeurig getal tussen het bereik van 1 en 10: " + RandomNumber);

    }
}

