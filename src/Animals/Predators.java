package Animals;

import java.util.Objects;

public class Predators extends Mammal{
    private String typeOfFood;

    public Predators(String animalName, int numberOfLegs, String livingEnvironment, int movementSpeed, String typeOfFood) {
        super(animalName, numberOfLegs, livingEnvironment, movementSpeed);
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            this.typeOfFood = "другие животные";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank()) {
            this.typeOfFood = "другие животные";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }



     public void eat() {
        System.out.print("другие животные");

    }

    @Override
    public void sleep() {
        System.out.println("лежа");

    }

    @Override
    public void move() {
        System.out.println("может быстро бегать");
    }

    @Override
    public void walk() {
        System.out.print("на 4-х лапах");

    }
    public void hunt(){
        System.out.println("тихо подкрадываются к жертве");
    }

    @Override
    public String toString() {
        return getAnimalName() + " имеет " + getNumberOfLegs() + " лапы, место обитания - " + getLivingEnvironment() +
                ", может развивать скорость до " + getMovementSpeed() + " км/ч , еда - " + getTypeOfFood();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predators)) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

}
