package nl.jantineislief.keeropkeer.Model;

import java.util.List;

public class Player {

    private String name;
    private List<List<ColorCell>> board;
    private int jokers;
    private int stars;
    private int score;

    public Player(String name) {
        this.name = name;
        this.board = BoardCreator.getNewBoard();
        this.stars = BoardCreator.getNumberOfStars();
        this.jokers = 8;
        this.score = 0;
    }
}
