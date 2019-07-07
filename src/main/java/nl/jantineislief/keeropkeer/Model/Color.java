package nl.jantineislief.keeropkeer.Model;

public enum Color {

    GREEN("#90AD26"),
    ORANGE("#E17A39"),
    YELLOW("#E9B732"),
    RED("#D93D62"),
    BLUE("#6FBAD0");

    public final String colorString;

    private Color(String color){
        this.colorString = color;
    }
}
