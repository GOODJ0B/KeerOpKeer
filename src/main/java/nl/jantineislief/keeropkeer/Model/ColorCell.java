package nl.jantineislief.keeropkeer.Model;

public class ColorCell {

    private Color color;
    private boolean checked;
    private boolean isStar;

    public void setColor(Color color) {
        this.color = color;
    }

    public void setStar(boolean star) {
        isStar = star;
    }
}
