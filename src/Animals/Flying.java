package Animals;

import java.util.Objects;

public class Flying extends Birds{
    private final String typeOfMovement;

    public Flying(String animalName, int numberOfLegs, String livingEnvironment, String typeOfMovement) {
        super(animalName, numberOfLegs, livingEnvironment);
        if (typeOfMovement == null || typeOfMovement.isBlank() || typeOfMovement.isEmpty()) {
            this.typeOfMovement = "машет крылышками";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }
    public void fly(){
        System.out.println("Машут крыльями");
    }

    @Override
    public void eat() {
        System.out.println("пикируют на жертву");
    }

    @Override
    public void sleep() {
        System.out.println("в гнезде");

    }

    @Override
    public void move() {
        System.out.println("летают или ходят");
    }

    @Override
    public void hunt() {
        System.out.println("ищут жертву с высоты полета");
    }
    @Override
    public String toString() {
        return getAnimalName() + " относится к классу " + " - летающие, " + " имеет " + getNumberOfLegs() + " лапы, место обитания - " + getLivingEnvironment() +
                ", среда обитания - " + getLivingEnvironment() + ", тип передвижения - " + getTypeOfMovement();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flying)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeOfMovement, flying.typeOfMovement);
    }

}
