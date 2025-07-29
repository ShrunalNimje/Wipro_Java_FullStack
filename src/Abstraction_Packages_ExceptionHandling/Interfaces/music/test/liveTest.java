package Abstraction_Packages_ExceptionHandling.Interfaces.music.test;


import Abstraction_Packages_ExceptionHandling.Interfaces.music.Playable;
import Abstraction_Packages_ExceptionHandling.Interfaces.music.Saxophone.Saxophone1;
import Abstraction_Packages_ExceptionHandling.Interfaces.music.Veena.Veena1;

public class liveTest {
    public static void main(String[] args) {
        Veena1 veena = new Veena1();
        Saxophone1 saxophone = new Saxophone1();

        veena.play();
        saxophone.play();

        Playable p1 = veena;
        Playable p2 = saxophone;

        p1.play();
        p2.play();
    }
}

