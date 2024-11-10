package KI305.Symanyshyn.Lab2;

import java.util.Objects;

/**
 * Represents a set of climbing equipment including a rope, harness, and helmet.
 * Provides various methods to interact with and manipulate the equipment.
 */
public class ClimberEquipment {
    private Rope rope;
    private Harness harness;
    private Helmet helmet;
    private Logger logger;

    /**
     * Default constructor that initializes the equipment with default rope, harness, and helmet.
     */
    public ClimberEquipment() {
        this.rope = new Rope();
        this.harness = new Harness();
        this.helmet = new Helmet();
        this.logger = new Logger();
    }

    /**
     * Constructor that allows specifying the rope, harness, and helmet.
     *
     * @param rope    The rope to be used.
     * @param harness The harness to be used.
     * @param helmet  The helmet to be used.
     */
    public ClimberEquipment(Rope rope, Harness harness, Helmet helmet) {
        this.rope = rope;
        this.harness = harness;
        this.helmet = helmet;
        this.logger = new Logger();
    }

    /**
     * Retrieves the details of the equipment.
     *
     * @return A string representation of the equipment's rope length, harness type, and helmet color.
     */
    public String getEquipmentDetails() {
        logger.logAction("Retrieving equipment details.");
        return "Rope: " + rope.getLength() + " meters, " +
               "Harness: " + harness.getType() + ", " +
               "Helmet: " + helmet.getColor();
    }

    /**
     * Simulates using the equipment.
     */
    public void useEquipment() {
        logger.logAction("Using equipment.");
    }

    /**
     * Sets a new rope for the equipment.
     *
     * @param rope The new rope to be used.
     */
    public void setRope(Rope rope) {
        logger.logAction("Setting a new rope.");
        this.rope = rope;
    }

    /**
     * Retrieves the rope associated with the equipment.
     *
     * @return The rope used in the equipment.
     */
    public Rope getRope() {
        logger.logAction("Getting rope.");
        return rope;
    }

    /**
     * Sets a new harness for the equipment.
     *
     * @param harness The new harness to be used.
     */
    public void setHarness(Harness harness) {
        logger.logAction("Setting a new harness.");
        this.harness = harness;
    }

    /**
     * Retrieves the harness associated with the equipment.
     *
     * @return The harness used in the equipment.
     */
    public Harness getHarness() {
        logger.logAction("Getting harness.");
        return harness;
    }

    /**
     * Sets a new helmet for the equipment.
     *
     * @param helmet The new helmet to be used.
     */
    public void setHelmet(Helmet helmet) {
        logger.logAction("Setting a new helmet.");
        this.helmet = helmet;
    }

    /**
     * Retrieves the helmet associated with the equipment.
     *
     * @return The helmet used in the equipment.
     */
    public Helmet getHelmet() {
        logger.logAction("Getting helmet.");
        return helmet;
    }

    /**
     * Compares this ClimberEquipment with another for equality.
     *
     * @param o The object to compare with.
     * @return True if the two objects are equal, otherwise false.
     */
    @Override
    public boolean equals(Object o) {
        logger.logAction("Comparing equipment for equality.");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClimberEquipment that = (ClimberEquipment) o;
        return Objects.equals(rope, that.rope) &&
               Objects.equals(harness, that.harness) &&
               Objects.equals(helmet, that.helmet);
    }

    /**
     * Generates a hash code for the ClimberEquipment.
     *
     * @return The hash code of the ClimberEquipment.
     */
    @Override
    public int hashCode() {
        logger.logAction("Calculating equipment hash code.");
        return Objects.hash(rope, harness, helmet);
    }

    /**
     * Generates a string representation of the ClimberEquipment.
     *
     * @return A string containing the details of the ClimberEquipment.
     */
    @Override
    public String toString() {
        logger.logAction("Generating equipment string representation.");
        return "ClimberEquipment{" +
               "rope=" + rope +
               ", harness=" + harness +
               ", helmet=" + helmet +
               '}';
    }

    /**
     * Closes the logger to ensure all resources are released properly.
     */
    public void closeLogger() {
        logger.close();
    }
}
