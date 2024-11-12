package telran.reflection;

public class Runner extends Sportsman {
    private String speed;

    public Runner(String speed, String name) {
        super(name);
        this.speed = speed;
    }

    @Override
    public void action() {
        System.out.printf("I'm runner, my name is %s, running with speed %s", getName(), speed);
    }

}
