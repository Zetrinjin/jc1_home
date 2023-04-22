package part5.Task39;

public class Garage<T> extends Vehicle {

    public T nameOf;

    public T getNameOf() {
        return nameOf;
    }

    public void setNameOf(T nameOf) {
        this.nameOf = nameOf;
    }

    @Override
    public String name() {
        return "в гараже: " + nameOf;
    }
}
