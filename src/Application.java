public class Application {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Митя");
        human.setLastName(" Тутукаридзе");
        human.setAge(32);
        System.out.println(human.toString());
    }
}
