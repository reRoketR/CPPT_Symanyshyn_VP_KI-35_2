package KI305.Symanyshyn.lab3;

/**
 * Represents a climbing helmet with a specified color.
 */
public class Helmet {
    private String color;

    /**
     * Default constructor initializing the helmet color to a standard color.
     */
    /*public Helmet() {
        this.color = "Red";
    }*/


    public Helmet(String color) {
        this.color = color;
    }
    /**
     * Retrieves the color of the helmet.
     *
     * @return The color of the helmet.
     */
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Helmet{" + "color='" + color + '\'' + '}';
    }
}
