public class Application {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Митя");
        human.setLastName(" Тутукаридзе");
        human.setAge(32);

        Human human1 = new Human();
        human1.setName("Митя");
        human1.setLastName("Тутукаридзе");
        human1.setAge(32);

        System.out.println(human.equals(human1));
    }
}