package poly;

public class DriverEx {
    public static void main(String[] args) {
        Driver driver = new Driver();

        driver.driver(new Bus());
        driver.driver(new Taxi());
        driver.driver(new Vheicle());
    }
}
