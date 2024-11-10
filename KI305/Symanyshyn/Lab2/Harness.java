package KI305.Symanyshyn.Lab2;

/**
 * Represents a climbing harness with a specified type.
 */
public class Harness {
    private String type;

    /**
     * Default constructor initializing the harness type to a standard type.
     */
    public Harness() {
        this.type = "Standard";
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
