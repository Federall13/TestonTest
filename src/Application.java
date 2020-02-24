import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Human europian = new European("","", 00);
        Human asian = new Asian("","", 00);
        Human black = new Black ("","", 00);
        Animal zebra = new Animal();
        Animal tiger = new Animal();
        Animal crocodile = new Animal();
        ArrayList<Needs> arrayList = new ArrayList<>();
        arrayList.add(europian);
        arrayList.add(zebra);
        arrayList.add(asian);
        arrayList.add(tiger);
        arrayList.add(black);
        arrayList.add(crocodile);
        for (int i = 0; i < arrayList.size(); i++) {
          Needs needs = arrayList.get(i);


        }
    }
}