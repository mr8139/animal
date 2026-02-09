package michal.rapaport.animal;

public class Dog extends animal1 {
    private String type;

    public Dog(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dog{" + "name = "+super.name +
                "type='" + type + '\'' +
                '}';
    }
}
