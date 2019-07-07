package nl.jantineislief.keeropkeer.Model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BoardCreator {

    private final static int BOARD_HEIGHT = 7;
    private final static int BOARD_WIDTH = 15;
    private final static Point[] greenPoints = new Point[]{
            new Point(0, 0), new Point(1, 0), new Point(2, 0),
            new Point(7, 0), new Point(1, 1), new Point(4, 1),
            new Point(13, 1), new Point(14, 1), new Point(1, 2),
            new Point(3, 2), new Point(4, 2), new Point(5, 2),
            new Point(6, 2), new Point(13, 2), new Point(14, 2),
            new Point(3, 3), new Point(8, 3), new Point(9, 3),
            new Point(10, 6), new Point(11, 6), new Point(12, 6)
    };
    private final static Point[] yellowPoints = new Point[]{
            new Point(3, 0), new Point(4, 0), new Point(5, 0),
            new Point(6, 0), new Point(12, 0), new Point(13, 0), new Point(14, 0),
            new Point(2, 1), new Point(4, 1), new Point(5, 1), new Point(10, 2),
            new Point(11, 2), new Point(10, 3), new Point(11, 3), new Point(7, 5),
            new Point(8, 5), new Point(0, 6), new Point(1, 6), new Point(7, 6),
            new Point(8, 6), new Point(9, 6)
    };
    private final static Point[] bluePoints = new Point[]{
            new Point(8, 0), new Point(9, 0), new Point(10, 0), new Point(9, 1),
            new Point(10, 1), new Point(0, 2), new Point(0, 3), new Point(6, 3),
            new Point(7, 3), new Point(14, 3), new Point(6, 4), new Point(7, 4),
            new Point(1, 5), new Point(2, 5), new Point(11, 5), new Point(12, 5),
            new Point(13, 5), new Point(2, 6), new Point(3, 6), new Point(4, 6),
            new Point(5, 6)
    };
    private final static Point[] orangePoints = new Point[]{
            new Point(11, 0), new Point(0, 1), new Point(6, 1), new Point(7, 1),
            new Point(11, 1), new Point(12, 1), new Point(12, 2), new Point(4, 3),
            new Point(5, 3), new Point(12, 3), new Point(1, 4), new Point(2, 4),
            new Point(3, 4), new Point(4, 4), new Point(8, 4), new Point(9, 4),
            new Point(10, 4), new Point(9, 5), new Point(14, 5), new Point(13, 6),
            new Point(14, 6)
    };
    private final static Point[] redPoints = new Point[]{
            new Point(8, 1), new Point(2, 2), new Point(7, 2), new Point(8, 2),
            new Point(9, 2), new Point(1, 3), new Point(2, 3), new Point(13, 3),
            new Point(0, 4), new Point(5, 4), new Point(11, 4), new Point(12, 4),
            new Point(13, 4), new Point(14, 4), new Point(0, 5), new Point(3, 5),
            new Point(4, 5), new Point(5, 5), new Point(6, 5), new Point(10, 5),
            new Point(6, 6)
    };
    private final static Point[] starPoints = new Point[]{
            new Point(7, 0), new Point(11, 0), new Point(2, 1), new Point(4, 1),
            new Point(9, 1), new Point(0, 2), new Point(6, 2), new Point(5, 3),
            new Point(13, 3), new Point(1, 5), new Point(3, 5), new Point(8, 5),
            new Point(10, 5), new Point(14, 5), new Point(12, 6)
    };


    static List<List<ColorCell>> getNewBoard() {
        List<List<ColorCell>> board = createEmptyBoard();
        putColorsOnBoard(board);
        putStarsOnBoard(board);
        return board;
    }

    private static List<List<ColorCell>> createEmptyBoard() {
        List<List<ColorCell>> board = new ArrayList<>();
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            List<ColorCell> row = new ArrayList<>();
            for (int j = 0; j < BOARD_WIDTH; j++) {
                row.add(new ColorCell());
            }
            board.add(row);
        }
        return board;
    }

    private static void putColorsOnBoard(List<List<ColorCell>> board) {
        for (Point point : greenPoints) {
            board.get(point.y).get(point.x).setColor(Color.GREEN);
        }
        for (Point point : yellowPoints) {
            board.get(point.y).get(point.x).setColor(Color.YELLOW);
        }
        for (Point point : bluePoints) {
            board.get(point.y).get(point.x).setColor(Color.BLUE);
        }
        for (Point point : orangePoints) {
            board.get(point.y).get(point.x).setColor(Color.ORANGE);
        }
        for (Point point : redPoints) {
            board.get(point.y).get(point.x).setColor(Color.RED);
        }
    }

    private static void putStarsOnBoard(List<List<ColorCell>> board) {
        for (Point point : starPoints) {
            board.get(point.y).get(point.x).setStar(true);
        }
    }

    public static int getNumberOfStars() {
        return starPoints.length;
    }
}
