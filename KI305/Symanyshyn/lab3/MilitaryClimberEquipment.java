package KI305.Symanyshyn.lab3;

/**
 * Represents specialized military climbing equipment with enhanced durability.
 * Implements the Maintenance interface to ensure equipment reliability.
 */
public class MilitaryClimberEquipment extends ClimberEquipment implements Maintenance {
    private String camouflagePattern;

    /**
     * Constructor to initialize military equipment with a specific camouflage pattern.
     *
     * @param rope       Rope used in the equipment.
     * @param harness    Harness used in the equipment.
     * @param helmet     Helmet used in the equipment.
     * @param camouflagePattern The camouflage pattern used.
     */
    public MilitaryClimberEquipment(Rope rope, Harness harness, Helmet helmet, String camouflagePattern) {
        super(rope, harness, helmet);
        this.camouflagePattern = camouflagePattern;
    }

    /**
     * Displays detailed information about the military equipment, including camouflage.
     *
     * @return Details of the equipment.
     */
    @Override
    public String displayEquipmentDetails() {
        return "MilitaryClimberEquipment with " + camouflagePattern + " pattern. " + super.getEquipmentDetails();
    }

    /**
     * Inspects the equipment for signs of wear.
     */
    @Override
    public void inspectEquipment() {
        System.out.println("Inspecting military equipment for wear and tear.");
    }

    /**
     * Performs necessary repairs on the equipment.
     */
    @Override
    public void performRepairs() {
        System.out.println("Performing repairs on military equipment.");
    }
}

