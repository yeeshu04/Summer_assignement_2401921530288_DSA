package oops.week2.music.live;

import oops.week2.music.Playable;
import oops.week2.music.string.Veena;
import oops.week2.music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        // Part (a)
        Veena veena = new Veena();
        veena.play();

        // Part (b)
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // Part (c)
        Playable instrument;

        instrument = new Veena();
        instrument.play();

        instrument = new Saxophone();
        instrument.play();
    }
}