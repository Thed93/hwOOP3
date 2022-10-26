package Transport;

public class Train extends transport{
   private int trainCost;
    private int tripTime;
    private String departureStation;
    private String endingStation;
    private int numberOfWafons;

    public int getTrainCost() {
        return trainCost;
    }

    public void setTrainCost(int trainCost) {
        this.trainCost = trainCost;
    }

    public int getTripTime() {
        return tripTime;
    }

    public void setTripTime(int tripTime) {
        this.tripTime = tripTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }

    public int getNumberOfWafons() {
        return numberOfWafons;
    }

    public void setNumberOfWafons(int numberOfWafons) {
        this.numberOfWafons = numberOfWafons;
    }


    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " , " + getYearOfIssue() + " года выпуска, сборка в " + getCountry() +
                ", " + getBodyColor() + " цвет, максимальная скорость - " + getMaxSpeed() + " км/ч, цена билета - " + getTrainCost() + " рублей, " +
                "время поездки - " + getTripTime() + " минут, станция отбытия - " + getDepartureStation() + ", станция прибытия - " + getEndingStation()
                + ", колличество вагонов - " + getNumberOfWafons() + " шт.";
    }

    public Train(String brand, String model, int yearOfIssue, String country, String bodyColor, int maxSpeed, int trainCost, int tripTime, String departureStation, String endingStation, int numberOfWafons) {
        super(brand, model, yearOfIssue, country, bodyColor, maxSpeed);
        if (trainCost <= 0) {
            this.trainCost = 95;
        } else {
            this.trainCost = trainCost;
        }
        if (tripTime <= 0 ) {
            this.tripTime = 60;
        } else {
            this.tripTime = tripTime;
        }
        if (departureStation == null || departureStation.isBlank() || departureStation.isEmpty()) {
            this.departureStation = "Москва";
        } else {
            this.departureStation = departureStation;
        }
        if (endingStation == null || endingStation.isEmpty() || endingStation.isBlank()) {
            this.endingStation = "Санкт - Петербург";
        } else {
            this.endingStation = endingStation;
        }
        if (numberOfWafons <=0) {
            this.numberOfWafons = 5;
        } else {
            this.numberOfWafons = numberOfWafons;
        }




    }

    @Override
    public void refill() {
        System.out.println("нужно заправлять дизелем.");
    }
}
