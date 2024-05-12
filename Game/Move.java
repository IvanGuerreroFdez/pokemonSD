public class Move {
    public String name, type;
    public int power, accuracy;
    private int priority;

    public Move(String name, String type, int power, int accuracy, int priority) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
        this.priority = priority;
    }

    public String getName() {
        return this.name;
    }

    public int getPriority() {
        return priority;
    }

    public String toString() {
        return name;
    }
}
