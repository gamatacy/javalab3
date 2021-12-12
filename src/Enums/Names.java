package Enums;

import java.util.Random;

public enum Names {
    Svante,
    Herr,
    Fru,
    Bosse,
    Bettan,
    Krister,
    Oskar,
    Filip;

    public static Names getName(int num){
        return Names.values()[num];
    }
}
