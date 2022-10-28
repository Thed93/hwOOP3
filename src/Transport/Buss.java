package Transport;

public class Buss extends Transport {
    public Buss(String brand, String model, int yearOfIssue, String country, String bodyColor, int maxSpeed) {
        super(brand, model, yearOfIssue, country, bodyColor, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("можно заправлять бензином или дизелем на заправке.");
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " , " + getYearOfIssue() + " года выпуска, сборка в " + getCountry() +
                ", " + getBodyColor() + " цвет, максимальная скорость - " + getMaxSpeed() + " км/ч";
    }
}
