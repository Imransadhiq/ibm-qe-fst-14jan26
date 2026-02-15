interface BicycleParts {
    public int tyres = 2;
    public int maxSpeed = 25;
}
interface BicycleOperations {
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}
class Bicycle implements BicycleParts, BicycleOperations {

    public int gears;
    public int Speed;
    public Bicycle(int gears, int Speed) {
        this.gears = gears;
        this.Speed = Speed;
    }

    public void applyBrake(int decrement) {
        Speed -= decrement;
        System.out.println("Current speed: " + Speed);
    }
    public void speedUp(int increment) {
        Speed += increment;
        System.out.println("Current speed: " + Speed);
    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed);
    }
}
class MountainBike extends Bicycle {


    public int seatHeight;

    public MountainBike(int gears, int currentSpeed, int startHeight) {
        //Invoking base-class(Bicycle) constructor
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }


    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }  
}

