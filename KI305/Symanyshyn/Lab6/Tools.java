package KI305.Symanyshyn.Lab6;

/**
 * Клас, що представляє молоток.
 */
class Hammer implements Tool {
    private String name;
    private int weight; // Вага молотка

    public Hammer(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getValue() {
        return weight;
    }

    @Override
    public int compareTo(Tool o) {
        return Integer.compare(this.weight, o.getValue());
    }

    public void setName(String name) {
        this.name = name;
    }
}

/**
 * Клас, що представляє викрутку.
 */
class Screwdriver implements Tool {
    private String name;
    private int length; // Довжина викрутки

    public Screwdriver(String name, int length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getValue() {
        return length;
    }

    @Override
    public int compareTo(Tool o) {
        return Integer.compare(this.length, o.getValue());
    }
}
