package Animals;

import java.util.Objects;

public abstract class Birds extends Animals{
    private String livingEnvironment;

    public Birds(String animalName, int numberOfLegs, String livingEnvironment) {
        super(animalName, numberOfLegs);
        setLivingEnvironment(livingEnvironment);
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
    public abstract void hunt();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Birds)) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }
    @Override
    public String toString() {
        return "птица";
    }
}
