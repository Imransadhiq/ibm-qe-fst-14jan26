public class Hello {
    public static void main(String[] args) {
       // System.out.println("Hello World");
       String name  = "Monkey d Luffy";
       String name2 = "I'm the kning of Pirates";
       System.out.println(name.toUpperCase());
       System.out.println(name);
       System.out.println(name.length());
       System.out.println(name + " "+name2);

       if (name.length() == 14){
        System.out.println("True");
       }
       //arrays
        String[] Car = {"BMW","AUDI","VolksWagen"};
       for(int i=0;i<Car.length;i++){
        System.out.println(Car[i]);}
    }
}
