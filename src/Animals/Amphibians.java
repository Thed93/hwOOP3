package Animals;

public class Amphibians extends Animals{
    private String livingEnvironment;

    public Amphibians(String animalName, int numberOfLegs, String livingEnvironment) {
        super(animalName, numberOfLegs);
        if (livingEnvironment == null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()) {
            this.livingEnvironment = "среда проживания не определена";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }
    public void hunt(){
        System.out.println("непожвижно стоит, в ожидании жертвы");
    }

    @Override
    public void eat() {
        System.out.println("жучки и червячки");
    }

    @Override
    public void sleep() {
        System.out.println("стоя");
    }

    @Override
    public void move() {
        System.out.println("ползком или прыжками");
    }

    @Override
    public String toString() {
        return getAnimalName() + " имеет " + getNumberOfLegs() + " лапы, место обитания - " + getLivingEnvironment() +
                ", среда обитания - " + getLivingEnvironment();
    }
}
