import Animals.*;
import Transport.Car;
import Transport.Train;
import Transport.buss;

public class Main {
    public static void main(String[] args) {
        Car.key standartKey = new Car.key();
        Car.key modernKey = new Car.key(true,true);

        Car.insurance stIs = new Car.insurance(null, 2000, "123321123");

        Car lada = new Car("Lada", "Granta", 1990, "Россия", null, 70, 1.5f, null, null,
                null, 5,null, standartKey, stIs);

        System.out.println(lada);
        System.out.println();
        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", null, 301, 3500,
                0, "Белорусский вокзал", "Минск - Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", null, 270, 1700,
                0, "Ленинградский вокзал", "Ленинград - Пассажирский", 8);

        System.out.println(lastochka + "\n" + leningrad);

        buss icarus = new buss("Икарус", "Желтый", 1990, "Россия", "желтый", 60);
        buss gazelle = new buss("Газель", "Маршрутка", 2015, "Россия", null, 100);
        buss schoolBus = new buss("Школьный", "Автобус", 2000, "Канада", "желтый", 60);

        System.out.println("\n" + icarus + "\n" + gazelle + "\n" + schoolBus);

        System.out.println();

        Predators tiger = new Predators("Тигр", 4, "лес",
                60, "другие животные");
        Predators bear = new Predators("Медведь", 4, "лес", 30,
                "рыба, мед");
        Predators hiena = new Predators("Гиена", 4, "лес, пустыня", 40,
                "другие уже убитые животные");
        Herbivores horse = new Herbivores("Лошадь", 4, "прерии", 70,
                "трава");
        Herbivores giraffe = new Herbivores("Жираф", 4, "Африка", 40,
                "листья высоких деревьев");
        Herbivores gazelleAnimal = new Herbivores("Газель", 4, "Африка", 60,
                "растения");
        Amphibians frog = new Amphibians("Лягушка", 4, "Болота");
        Amphibians snake = new Amphibians("Уж пресноводный", 0, "вблизи водоема");
        Flying gull = new Flying("Чайка", 2, "вблизи водоема", "полет");
        Flying albatross = new Flying("Альбатрос", 2, "вблизи водоема", "полет");
        Flying falcon = new Flying("Сокол", 2, "вблизи гор", "полет");
        NotFlying peacock = new NotFlying("Павлин", 2, "тропики", "передвижение лапками");
        NotFlying dodo = new NotFlying("Додо", 2, "тропики", "лапками");
        NotFlying penguin = new NotFlying("Пингвин", 2, "арктика", "плаванье или передвижение лапками");


        System.out.println(tiger + "\n" + bear + "\n " + hiena + "\n" + horse + "\n" + giraffe + "\n" + gazelleAnimal + "\n" + frog +
                "\n" + snake + "\n" + gull + "\n" + albatross +"\n" + falcon +"\n" + peacock + "\n" + dodo + "\n" + penguin);
    }

}
