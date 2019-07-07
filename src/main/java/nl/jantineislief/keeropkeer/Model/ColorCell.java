package nl.jantineislief.keeropkeer.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ColorCell {

    private Color color;
    private String colorString;
    private boolean checked;
    private boolean isStar;
    private boolean isMiddleRow;

    public void setColor(Color color) {
        this.color = color;
        this.colorString = color.colorString;
    }

    public void setStar(boolean star) {
        isStar = star;
    }
}
