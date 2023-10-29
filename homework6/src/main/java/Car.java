public class Car {
    private String engine;
    private String gearbox;
    public Car(String engine, String gearbox) {
        this.engine = engine;
        this.gearbox = gearbox;
    }
    public Car(String engine) {
        this.engine = engine;
    }
    public Car() {
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    @Override
    public String toString() {
        return "Car[" +
                "engine='" + engine + '\'' +
                ", gearbox='" + gearbox + '\'' +
                ']';
    }
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null) return false;
//        if (!(obj instanceof Car)) return false;
//        Car car = (Car) obj;
//        return this.engine.equals(car.engine) &&
//                this.gearbox.equals(car.gearbox);
//    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Car)) return false;
        Car car = (Car) obj;
        return this.engine.equals(car.engine);
    }
}
