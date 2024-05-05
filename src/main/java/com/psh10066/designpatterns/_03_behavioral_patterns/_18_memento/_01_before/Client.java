package com.psh10066.designpatterns._03_behavioral_patterns._18_memento._01_before;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);
        System.out.println(game);

        int blueTeamScore = game.getBlueTeamScore();
        int redTeamScore = game.getRedTeamScore();

        game.setBlueTeamScore(12);
        game.setRedTeamScore(22);

        game = new Game();
        game.setBlueTeamScore(blueTeamScore);
        game.setRedTeamScore(redTeamScore);
        System.out.println(game);
    }
}
