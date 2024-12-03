class Harness:
    """
    Represents a climbing harness with a specified type.
    """
    def __init__(self, type="Standard"):
        self.type = type

    def __str__(self):
        return f"Harness(type={self.type})"
