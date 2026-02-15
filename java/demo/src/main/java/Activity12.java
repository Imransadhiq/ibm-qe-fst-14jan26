interface method{
    String display(String str);
}

public class Activity12 {
    public static void main(String[] args) {
        method obj = (String str) ->{
            return "hello " + str;

        };
        System.out.println(obj.display("Imran"));
    }
    
}
