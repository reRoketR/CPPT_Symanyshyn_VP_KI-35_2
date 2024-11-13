package KI305.Symanyshyn.lab3;

/**
 * Driver class to test the functionality of MilitaryClimberEquipment.
 */
public class MilitaryClimberEquipmentDriver {
    public static void main(String[] args) {
        Rope rope = new Rope(30); 
        Harness harness = new Harness("Military");
        Helmet helmet = new Helmet("Camo Green"); 

        MilitaryClimberEquipment equipment = new MilitaryClimberEquipment(rope, harness, helmet, "Forest Camo");
        
        System.out.println(equipment.displayEquipmentDetails());
        equipment.inspectEquipment();
        equipment.performRepairs();

        Maintenance maintenance = equipment;

        maintenance.inspectEquipment();
        maintenance.performRepairs();
    }
}

