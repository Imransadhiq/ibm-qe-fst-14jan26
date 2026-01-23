import java.util.HashSet;

public class Hashst {
    public static void main(String[] args) {
        HashSet <String> hs = new HashSet<>();
        hs.add("VolksWagen");
        hs.add("Audi");
        hs.add("Benz");
        hs.add("BMW");
        hs.add("Mustang");
        hs.add("GT");
        System.out.println(hs.size());
        hs.remove("GT");
        System.out.println(hs.size());
        hs.remove("Kawasaki");
        System.out.println(hs);
        System.out.println(hs.contains("Kawasaki"));
        System.out.println(hs);
        
    }
}
