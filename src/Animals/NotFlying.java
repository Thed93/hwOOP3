package Animals;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class NotFlying extends Birds {
    private String typeOfMovement;

    public NotFlying(String animalName, int numberOfLegs, String livingEnvironment, String typeOfMovement) {
        super(animalName, numberOfLegs, livingEnvironment);
        if (typeOfMovement == null || typeOfMovement.isBlank() || typeOfMovement.isEmpty()) {
            this.typeOfMovement = "перебирает лапками";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void walk() {
        System.out.println("перебирают лапками");

    }

    @Override
    public void eat() {
        System.out.println("рыба");

    }

    @Override
    public void sleep() {
        System.out.println("на земле");

    }

    @Override
    public void move() {
        System.out.println("на лапках");
    }

    @Override
    public void hunt() {
        System.out.println("догоняют жертву");

    }

    @Override
    public String toString() {
        return getAnimalName() + " имеет " + getNumberOfLegs() + " лапы, место обитания - " + getLivingEnvironment() +
                ", среда обитания - " + getLivingEnvironment() + ", тип передвижения - " + getTypeOfMovement();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NotFlying)) return false;
        if (!super.equals(o)) return false;
        NotFlying notFlying = (NotFlying) o;
        return Objects.equals(typeOfMovement, notFlying.typeOfMovement);
    }

}