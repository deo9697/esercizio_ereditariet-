package astratti;

import astratti.rettangolo2;
import astratti.triangolo;

public class entrypoint {
    public static void main(String[] args) {
        triangolo triangolo = new triangolo(1.8,1.9);
        rettangolo2 rettangolo = new rettangolo2(2.3 , 2.5);

        System.out.println(triangolo.calcolaArea());
        System.out.println(rettangolo.calcolaArea());
    }
}
