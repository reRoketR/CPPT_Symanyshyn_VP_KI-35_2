package KI305.Symanyshyn.lab3;

import java.util.Objects;

/**
 * Abstract class representing the base climbing equipment.
 * Contains methods to manage basic climbing equipment components.
 */
public abstract class ClimberEquipment {
    private Rope rope;
    private Harness harness;
    private Helmet helmet;

    // Constructor and essential methods from Lab 2
    // Omit implementation for brevity

    /**
     * Abstract method to be implemented by subclasses to display specific equipment details.
     */
    public abstract String displayEquipmentDetails();


     /**
     * Default constructor that initializes the equipment with default rope, harness, and helmet.
     */
    public ClimberEquipment() {
        this.rope = new Rope();
        this.harness = new Harness("Red");
        this.helmet = new Helmet("Red");
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
    }

    /**
     * Retrieves the details of the equipment.
     *
     * @return A string representation of the equipment's rope length, harness type, and helmet color.
     */
    public String getEquipmentDetails() {
        return "Rope: " + rope.getLength() + " meters, " +
               "Harness: " + harness.getType() + ", " +
               "Helmet: " + helmet.getColor();
    }



    /**
     * Sets a new rope for the equipment.
     *
     * @param rope The new rope to be used.
     */
    public void setRope(Rope rope) {
        this.rope = rope;
    }

    /**
     * Retrieves the rope associated with the equipment.
     *
     * @return The rope used in the equipment.
     */
    public Rope getRope() {
        return rope;
    }

    /**
     * Sets a new harness for the equipment.
     *
     * @param harness The new harness to be used.
     */
    public void setHarness(Harness harness) {
        this.harness = harness;
    }

    /**
     * Retrieves the harness associated with the equipment.
     *
     * @return The harness used in the equipment.
     */
    public Harness getHarness() {
        return harness;
    }

    /**
     * Sets a new helmet for the equipment.
     *
     * @param helmet The new helmet to be used.
     */
    public void setHelmet(Helmet helmet) {
        this.helmet = helmet;
    }

    /**
     * Retrieves the helmet associated with the equipment.
     *
     * @return The helmet used in the equipment.
     */
    public Helmet getHelmet() {
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
        return Objects.hash(rope, harness, helmet);
    }

    /**
     * Generates a string representation of the ClimberEquipment.
     *
     * @return A string containing the details of the ClimberEquipment.
     */
    @Override
    public String toString() {
        return "ClimberEquipment{" +
               "rope=" + rope +
               ", harness=" + harness +
               ", helmet=" + helmet +
               '}';
    }

    
}

