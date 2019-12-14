package com.lits.automation.hw7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        MusicInstrument musicInstrument1 = new Piano();
        MusicInstrument musicInstrument2 = new Guitar();
        MusicInstrument musicInstrument3 = new Violin();

        Random randomNumber = new Random();

        if (randomNumber.nextInt(100) % 2 == 0){
            musicInstrument1.play();
        } else if (randomNumber.nextInt(100) %2 != 0){
            musicInstrument2.play();
        } else {
            musicInstrument3.play();
        }


    }
}
