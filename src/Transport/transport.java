package Transport;

import java.time.LocalDate;

public abstract class transport {

private final String brand;
private final String model;
private final int yearOfIssue;
private final String country;
private String bodyColor;
private int maxSpeed;

    public transport(String brand, String model, int yearOfIssue, String country, String bodyColor, int maxSpeed) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "данные не указаны";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "данные не указаны";
        } else {
            this.model = model;
        }
        if (yearOfIssue <= 1800) {
            this.yearOfIssue = LocalDate.now().getYear();
        } else {
            this.yearOfIssue = yearOfIssue;
        }
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (bodyColor == null || bodyColor.isEmpty() || bodyColor.isBlank()) {
            this.bodyColor = "белый";
        } else {
            this.bodyColor = bodyColor;
        }
        if (maxSpeed <=0) {
            this.maxSpeed = 60;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract void refill();
}
