public abstract class Car {
    private Engine engine;
    private Speed speed;

//    public Car(ExtraCar extraCar, Engine engine, Speed speed) {
//        this.extraCar = extraCar;
//        this.engine = engine;
//        this.speed = speed;
//    }

    public Car() {

    }


    public void showEngine() {
        engine.engineType();
    }



    public void showSpeed() {
        speed.maxSpeed();
    }

    @Override
    public String toString() {
        System.out.println("Has four wheels");
        return "";
    }
}

