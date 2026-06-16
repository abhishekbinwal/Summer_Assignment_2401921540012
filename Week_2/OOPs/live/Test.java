package Week_2.OOPs.live;

import Week_2.OOPs.music.Playable;
import Week_2.OOPs.music.string.Veena;
import Week_2.OOPs.music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Veena v = new Veena();
        v.play();

        Saxophone s = new Saxophone();
        s.play();

        Playable p1 = new Veena();
        p1.play();

        Playable p2 = new Saxophone();
        p2.play();

    }
}
