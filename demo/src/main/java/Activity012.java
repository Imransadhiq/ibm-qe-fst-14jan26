
public class Activity012{
    public static void main(String[] args) {
        Addable ad1 = (num1, num2) -> num1 + num2;
        Addable ad2 = (num1,num2) -> {
            int sum = num1+num2;
            return sum;
        };
        System.out.println(ad1.add (20,50));
        System.out.println(ad2.add (100,10));
    }
}