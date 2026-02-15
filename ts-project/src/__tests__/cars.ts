// Classes allow us to create 'blueprints' for objects

// How to create a class

class Cars {
    private speed: number;

    constructor(speed: number) {
        this.speed = speed || 0;
    }

    accelerate(): void {
        this.speed++;
    }

    throttle():void {
        this.speed--;
    }

    getSpeed():void {
        console.log(this.speed);
    }

    static numberOfWheels(): number {
        return 4;
    }
}

// Instantiate (create) an object from a class

let car = new Cars(5);
car.accelerate();
car.getSpeed();

console.log(Cars.numberOfWheels());