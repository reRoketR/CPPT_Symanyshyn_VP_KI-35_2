class Helmet:
    """
    Represents a climbing helmet with a specified color.
    """
    def __init__(self, color="Red"):
        self.color = color

    def __str__(self):
        return f"Helmet(color={self.color})"
