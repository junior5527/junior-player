package org.example;

import javazoom.jl.player.Player;

import java.io.FileInputStream;

public class JuniorPlayer {
    public void play(String ficheroCancion) {
        try{
            FileInputStream fis = new FileInputStream(ficheroCancion);
            Player playMP3 = new Player(fis);
            playMP3.play();
        }
        catch(Exception exc){
            exc.printStackTrace();
            System.out.println("Failed to play the file.");
        }
    }
}
