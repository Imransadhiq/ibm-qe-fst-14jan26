import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Imran");
        names.add("Mohammad");
        names.add("Ali");
        names.add("Zain");
        names.add("Hussain");
        for(String name: names){
            System.out.println(name);
        }
        System.out.println("Third name" + names.get(2));
        System.out.println(names.contains("Ali"));
        System.out.println(names.size());
        names.remove(3);
        System.out.println(names.size());
    }
    
}
