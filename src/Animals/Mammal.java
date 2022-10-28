package Animals;

import java.util.Objects;

public abstract class Mammal extends Animals {
    private String livingEnvironment;
    private int movementSpeed;

    public Mammal(String animalName, int numberOfLegs, String livingEnvironment, int movementSpeed) {
        super(animalName, numberOfLegs);
        setLivingEnvironment(livingEnvironment);
        setMovementSpeed(movementSpeed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()) {
            this.livingEnvironment = "среда проживания не определена";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        if (movementSpeed <= 0) {
            this.movementSpeed = 10;
        } else {
            this.movementSpeed = movementSpeed;
        }
    }

    public abstract void walk();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammal)) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return movementSpeed == mammal.movementSpeed && Objects.equals(livingEnvironment, mammal.livingEnvironment);
    }
    @Override
    public String toString() {
        return "млекопитающее";
    }
}
