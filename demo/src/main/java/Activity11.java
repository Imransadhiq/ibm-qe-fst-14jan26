import java.util.HashMap;


public class Activity11 {
    public static void main(String[] args) {
        HashMap <Integer, String> colors = new HashMap<>();
        colors.put(1,"Pink");
        colors.put(2,"Blue");
        colors.put(3,"Black");
        colors.put(4,"White");
        colors.remove(2,"Blue");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.containsValue("Black"));
    }
}
