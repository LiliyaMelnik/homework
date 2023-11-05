package cars;

public class Car {
    private String engine;
    private String color;

    public Car(String engine, String color) {
        this.engine = engine;
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String colorC) {
        if (colorC == "red") {
            throw new RuntimeException("Red color is not possible");
        }
        this.color = colorC;
        System.out.println("Text: color is possible");
    }
}
