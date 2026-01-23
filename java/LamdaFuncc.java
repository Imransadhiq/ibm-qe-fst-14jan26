import java.util.ArrayList;

public class LamdaFuncc{
    public static void main(String[] args) {
        // Create a ArrayList
        ArrayList<String> list=new ArrayList<String>();
        // Add values to the list
        list.add("Rick");
        list.add("Negan");
        list.add("Daryl");
        list.add("Glenn");
        list.add("Carl");
        // Loop through ArrayList

        list.forEach( 
        // lambda expression 
            (names)->System.out.println(names)
        );
        
        for(String namee:list){
            System.out.println(namee);
        }
    }
}