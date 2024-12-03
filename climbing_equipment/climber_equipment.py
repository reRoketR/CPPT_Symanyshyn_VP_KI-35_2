from .logger import Logger
from .rope import Rope
from .helmet import Helmet
from .harness import Harness

class ClimberEquipment:
    """
    Represents a set of climbing equipment including rope, harness, and helmet.
    """
    def __init__(self, rope=None, harness=None, helmet=None):
        self.rope = rope or Rope()
        self.harness = harness or Harness()
        self.helmet = helmet or Helmet()
        self.logger = Logger()

    def get_equipment_details(self):
        """
        Retrieves the details of the equipment.
        :return: A string representation of the equipment.
        """
        self.logger.log_action("Retrieving equipment details.")
        return f"{self.rope}, {self.harness}, {self.helmet}"

    def use_equipment(self):
        """
        Simulates using the equipment.
        """
        self.logger.log_action("Using equipment.")

    def set_rope(self, rope):
        """
        Sets a new rope.
        :param rope: The new rope to set.
        """
        self.logger.log_action("Setting a new rope.")
        self.rope = rope

    def close_logger(self):
        """
        Closes the logger.
        """
        self.logger.close()

    def __str__(self):
        return f"ClimberEquipment(rope={self.rope}, harness={self.harness}, helmet={self.helmet})"
