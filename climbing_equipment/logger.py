class Logger:
    """
    Responsible for logging actions to a file.
    """
    def __init__(self, filename="ClimberEquipment.log"):
        self.filename = filename
        with open(self.filename, "a", encoding="utf-8") as file:
            file.write("Logger initialized.\n")

    def log_action(self, action):
        """
        Logs an action to the log file.
        :param action: The action to log.
        """
        with open(self.filename, "a", encoding="utf-8") as file:
            file.write(action + "\n")

    def close(self):
        """
        Closes the logger.
        """
        with open(self.filename, "a", encoding="utf-8") as file:
            file.write("Logger closed.\n")
