package KI305.Symanyshyn.lab3;
/**
 * Represents a climbing rope with a specified length.
 */
public class Rope {
    private int length;

    /**
     * Default constructor initializing the rope length to a standard value.
     */
    public Rope() {
        this.length = 50;
    }

    public Rope(int length) {
        this.length = length;
    }

    /**
     * Retrieves the length of the rope.
     *
     * @return The length of the rope.
     */
    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Rope{" + "length=" + length + '}';
    }
}
