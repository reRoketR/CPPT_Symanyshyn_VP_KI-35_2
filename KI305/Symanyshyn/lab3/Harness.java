package KI305.Symanyshyn.lab3;

/**
 * Represents a climbing harness with a specified type.
 */
public class Harness {
    private String type;

    /**
     * Default constructor initializing the harness type to a standard type.
     */
    /*public Harness() {
        this.type = "Standard";
    }*/

    public Harness(String type) {
        this.type = type;
    }

    /**
     * Retrieves the type of the harness.
     *
     * @return The type of the harness.
     */
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Harness{" + "type='" + type + '\'' + '}';
    }
}
