package lesson8;

public class AnimalSounder {

    public static void main(String[] args) {
        Animal Gavrusha = new Cats("Гаврюша", 3, "мяу");
        Animal Bobik = new Dogs("Бобик", 1, "гав");
        Animal Kesha = new Cats("Кеша", 5, "чирик");
        Animal Murka = new Cats("Мурка", 2, "муу");

        Animal[] AnimalSounder= new Animal[] {Gavrusha, Bobik, Kesha, Murka};
        for (Animal animal : AnimalSounder) {
            System.out.println(animal.getSound());
        }

    }

}
