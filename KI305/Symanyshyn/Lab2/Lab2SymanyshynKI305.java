
package KI305.Symanyshyn.Lab2;


/**
 * A driver class to test the ClimberEquipment class functionality.
 */
public class Lab2SymanyshynKI305 {

    /**
     * Main method to test the ClimberEquipment class.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create an instance of ClimberEquipment with default components
        ClimberEquipment equipment = new ClimberEquipment();
        
        // Display the equipment details
        System.out.println("Equipment Details: ");
        System.out.println(equipment.getEquipmentDetails());
        
        // Simulate using the equipment
        equipment.useEquipment();
        
        // Change one of the components and display details again
        equipment.setRope(new Rope(20));
        System.out.println("Updated Equipment Details: ");
        System.out.println(equipment.getEquipmentDetails());
        
        // Close the logger to release resources properly
        equipment.closeLogger();
    }
}


