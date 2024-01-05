import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Listas (ArrayList)
        ArrayList<String> nombres= new ArrayList<>();
        nombres.add("Jose");
        nombres.add("Paul");
        System.out.println(nombres);

        nombres.add(1,"Bob");
        nombres.remove(0);
        nombres.set(1,"JOPA");
        System.out.println(nombres);

    }
}