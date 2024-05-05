package com.psh10066.designpatterns._03_behavioral_patterns._18_memento._03_java;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.*;

public class MementoInJava {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        // Serializable
        try (FileOutputStream fileOut = new FileOutputStream("GameSave.hex");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(game);
        }

        game.setBlueTeamScore(25);
        game.setRedTeamScore(15);

        try (FileInputStream fileIn = new FileInputStream("GameSave.hex");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            game = (Game) in.readObject();
            System.out.println(game);
        }
    }

    @Getter
    @Setter
    @ToString
    public static class Game implements Serializable {

        private int blueTeamScore;
        private int redTeamScore;
    }
}
