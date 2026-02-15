import java.util.ArrayList;


public class ArrayLst {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Imran");
        names.add("Mohammad");
        names.add("Ali");
        names.add("Zain");
        System.out.println("Names: "+names);
        names.set(3,"Malik");
        names.remove("zain");
        System.out.println("");
        System.out.println(names.size());
        for (String name : names){
            System.out.println(name);
        }


    }
}
