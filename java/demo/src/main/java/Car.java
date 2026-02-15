
public class Car {

    // Variables
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    // Constructor
    public Car() {
        tyres = 4;
        doors = 4;
    }

   
    public void displayCharacteristics() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Color: " + color);
        System.out.println("Transmission: " + transmission);
        System.out.println("Number of Tyres: " + tyres);
        System.out.println("Number of Doors: " + doors);
    }

    
    public void accelarate() {
        System.out.println("Car is moving forward.");
    }

   
    public void brake() {
        System.out.println("Car has stopped.");
    }
}
