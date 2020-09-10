package Sorteia;

import Enums.Cor;

import java.util.Random;

public class SorteiaCor {

    public static Cor sorteia() {
        int sorteado = new Random().nextInt(Cor.values().length);
        return Cor.values()[sorteado];
    }

}
