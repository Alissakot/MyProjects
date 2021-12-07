package lesson8;

public class AnimalSounder {

    public static void main(String[] args) {
        Animal Gavrusha = new Cats("Гаврюша", 3, "мяу");
        Animal Bobik = new Dogs("Бобик", 1, "гав");
        Animal Kesha = new Parrot("Кеша", 5, "чирик");
        Animal Murka = new Cow("Мурка", 2, "муу");

        Animal[] AnimalSounder= new Animal[] {Gavrusha, Bobik, Kesha, Murka};
        for (Animal anim : AnimalSounder) {
            System.out.println(anim.getSound());
        }

    }

}
