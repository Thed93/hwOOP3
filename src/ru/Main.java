package ru;

public class Main {
    public static void main(String[] args) {
        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", null, 301, 3500,
                0, "Белорусский вокзал", "Минск - Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", null, 270, 1700,
                0, "Ленинградский вокзал", "Ленинград - Пассажирский", 8);

        System.out.println(lastochka + "\n" + leningrad);

        buss icarus = new buss("Икарус", "Желтый", 1990, "Россия", "желтый", 60);
        buss gazelle = new buss("Газель", "Маршрутка", 2015, "Россия", null, 100);
        buss schoolBus = new buss("Школьный", "Автобус", 2000, "Канада", "желтый", 60);

        System.out.println("\n" + icarus + "\n" + gazelle + "\n" + schoolBus);

    }

}