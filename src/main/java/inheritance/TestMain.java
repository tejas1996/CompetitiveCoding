package inheritance;

public class TestMain {

    public static void main(String[] args) {

        WildAnimals wa1 = new WildAnimals(5, 5);
        wa1.bite();
        wa1.animalsThatWeEat("cat");
        wa1.animalsThatWeEat("dog");

    }


}
