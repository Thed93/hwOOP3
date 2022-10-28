package Animals;

import java.util.Objects;

public class Herbivores extends Mammal {
    private String typeOfFood;

    public Herbivores(String animalName, int numberOfLegs, String livingEnvironment, int movementSpeed, String typeOfFood) {
        super(animalName, numberOfLegs, livingEnvironment, movementSpeed);
        setTypeOfFood(typeOfFood);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            this.typeOfFood = "растения";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public void graze() {

    }

    @Override
    public void eat() {
        System.out.print("растения");

    }

    @Override
    public void sleep() {
        System.out.println("стоя");
    }

    @Override
    public void move() {
        System.out.print("на 4-х лапах");

    }

    @Override
    public void walk() {
        System.out.println("в составе стаи");

    }

    @Override
    public String toString() {
        return getAnimalName() + " имеет " + getNumberOfLegs() + " лапы, место обитания - " + getLivingEnvironment() +
                ", может развивать скорость до " + getMovementSpeed() + " км/ч , еда - " + getTypeOfFood();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Herbivores)) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

}