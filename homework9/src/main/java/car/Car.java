package car;

public class Car {
    private String model;
    private int year;
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public Car() {
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if (model == "" || model == "no model") {
            try {
                throw new ModelException ("Unsupported model");
            } catch (ModelException ex) {
                System.out.println("We catch model exception");
            }
        }
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year < 1990 || year > 2023) {
            try {
                throw new YearException("Invalid year");
            } catch (YearException exc) {
                System.out.println("We catch year exception");
            }
        }
        this.year = year;
    }
}
