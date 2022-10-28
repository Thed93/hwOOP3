package Animals;

import java.util.Objects;

public abstract class Animals {
    private String animalName;
    private final int numberOfLegs;

    public Animals(String animalName, int numberOfLegs) {
        setAnimalName(animalName);
        if (numberOfLegs < 0) {
            throw new RuntimeException("Укажите положительное колличсетво лап");
        } else {
            this.numberOfLegs = numberOfLegs;
        }
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setAnimalName(String animalName) {
        if (animalName == null || animalName.isEmpty() || animalName.isBlank()) {
            this.animalName = "Дружок";
        } else {
            this.animalName = animalName;
        }
    }

    public abstract void eat();



    public abstract void sleep();
    public abstract void move();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals)) return false;
        Animals animals = (Animals) o;
        return numberOfLegs == animals.numberOfLegs && Objects.equals(animalName, animals.animalName);
    }

    @Override
    public String toString() {
        return "животное";
    }
}
