from climbing_equipment.climber_equipment import ClimberEquipment
from climbing_equipment.rope import Rope


def main():
    print("Testing ClimberEquipment in Python.")

    # Create an instance of ClimberEquipment with default components
    equipment = ClimberEquipment()

    # Display the equipment details
    print("Equipment Details: ")
    print(equipment.get_equipment_details())

    # Simulate using the equipment
    equipment.use_equipment()

    # Change one of the components and display details again
    equipment.set_rope(Rope(20))
    print("Updated Equipment Details: ")
    print(equipment.get_equipment_details())

    # Close the logger
    equipment.close_logger()


if __name__ == "__main__":
    main()
