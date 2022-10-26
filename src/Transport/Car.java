package Transport;

import java.time.LocalDate;

public class Car extends transport {
    @Override
    public void refill() {
        System.out.println(" можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар");
    }

    public static class key {
        private boolean remoteEngineStart;
        private boolean keylessEntry;

        public key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }
        public key() {
            remoteEngineStart = false;
            keylessEntry = false;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(boolean remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        public void setKeylessEntry(boolean keylessEntry) {
            this.keylessEntry = keylessEntry;
        }

    }

    public static class insurance {
        private final LocalDate expereDay;
        private final int cost;
        private String number;

        public insurance(LocalDate expereDay, int cost, String number) {
            if (expereDay == null) {
                this.expereDay = LocalDate.now().plusDays(365);
            } else {
                this.expereDay = expereDay;
            }
            if (cost <= 0) {
                this.cost = 1000;
            } else {
                this.cost = cost;
            }
            if ( number == null ) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
            if (this.number.length() != 9) {
                throw new RuntimeException("некорректный номер страховки");
            }
        }
    }
    private float engineVolume;

    private String transmission;

    private String registrationNumber;
    private String bodyType;

    private int numberOfSeats;

    private String tireType;

    private boolean correctRegistrationNumber = true;

    private key key;

    private insurance insurance;

    public Car(String brand, String model, int yearOfIssue, String country, String bodyColor, int maxSpeed, float engineVolume, String transmission, String registrationNumber, String bodyType,
               int numberOfSeats, String tireType, key key, insurance insurance) {
        super(brand, model, yearOfIssue, country, bodyColor, maxSpeed);

        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }

        if (transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }

        if (bodyType == null) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }


        if (registrationNumber == null) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (this.registrationNumber.length() != 9) {
            correctRegistrationNumber = false;
        }
        char[] chars = this.registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || (!Character.isAlphabetic(chars[4])) || (!Character.isAlphabetic(chars[5]))) {
            correctRegistrationNumber = false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8]) ) {
            correctRegistrationNumber = false;
        }
        if (!correctRegistrationNumber) {
            throw new RuntimeException("Некорекно указан номер авто");
        }
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (tireType == "Летние" || tireType == "Зимние") {
            this.tireType = tireType;
        } else {
            this.tireType = "Летние";
        }
        if (key == null) {
            this.key = new key();
        } else {
            this.key = key;
        }
        this.insurance = insurance;
    }


    public float getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public boolean isCorrectRegistrationNumber() {
        return correctRegistrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTireType() {
        return tireType;
    }


    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }



    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public Car.key getKey() {
        return key;
    }

    public void setKey(Car.key key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " , " + getYearOfIssue() + " года выпуска, сборка в " + getCountry() +
                ", " + getBodyColor() + " цвет, максимальная скоростьобьем двигателя - " + getMaxSpeed() + " км/ч, обьем двигателя " + getEngineVolume()  +",  коробка передач - "
                + getTransmission() + ", тип кузова - " + getBodyType() + " , регистрационный номер - " + getRegistrationNumber()
                + ", колличество мест - " + getNumberOfSeats() + ", шины - " + tireType + (getKey().isRemoteEngineStart() ? ", имеется удаленный запуск двигателя" : ", удаленный запуск двигателя отсутствует") +
                (getKey().isKeylessEntry() ? ", безключевой запуск" : ", запуск с ключа");
    }

    public static void changeTireTipe (Car car) {
        if (car.getTireType().equals("Зимние")) {
            car.tireType = "Летние";
        } else {
            car.tireType = "Зимние";
        }

    }





}
