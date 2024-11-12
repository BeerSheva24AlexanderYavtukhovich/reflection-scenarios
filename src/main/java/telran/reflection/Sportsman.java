package telran.reflection;

public abstract class Sportsman {
    private String name;

    public String getName() {
        return name;
    }

    abstract void action();

    protected Sportsman(String name) {
        this.name = name;
    }
}
