package ru;

public class buss extends transport {
    public buss(String brand, String model, int yearOfIssue, String country, String bodyColor, int maxSpeed) {
        super(brand, model, yearOfIssue, country, bodyColor, maxSpeed);
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " , " + getYearOfIssue() + " года выпуска, сборка в " + getCountry() +
                ", " + getBodyColor() + " цвет, максимальная скорость - " + getMaxSpeed() + " км/ч";
    }
}
