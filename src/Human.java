import java.util.Objects;
public class Human {
    private String name;
    private String lastName;
    private int age;

    public Human(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void jump(){
        System.out.println(name + " Прыгает на пол метра");
    }

    @Override
    public String toString() {
        return name + " " + lastName + " " +age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age &&
                Objects.equals(name, human.name) &&
                Objects.equals(lastName, human.lastName);
    }
}

