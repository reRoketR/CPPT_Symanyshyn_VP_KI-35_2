package KI305.Symanyshyn.Lab2;
/**
 * Represents a climbing helmet with a specified color.
 */
public class Helmet {
    private String color;

    /**
     * Default constructor initializing the helmet color to a standard color.
     */
    public Helmet() {
        this.color = "Red";
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
