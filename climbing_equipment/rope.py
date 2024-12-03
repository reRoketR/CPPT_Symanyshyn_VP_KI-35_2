class Rope:
    """
    Represents a climbing rope with a specified length.
    """
    def __init__(self, length=50):
        self.length = length

    def __str__(self):
        return f"Rope(length={self.length} meters)"
