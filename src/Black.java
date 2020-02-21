public class Black extends Human {
    public Black(String name, String lastName, int age) {
        super(name, lastName, age);
    }
    @Override
    public void jump() {
        System.out.println(getName() + " Прыгает на метр");
    }
}