public abstract class Person {
    // TODO implement Person and its subclasses in other Java files
    private int age;
    private String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Hello my name is " + name + ". ";
    }
}
