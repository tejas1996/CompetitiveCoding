package inheritance;

public class WildAnimals extends Animal {


    StringBuilder animalThatWeeat = new StringBuilder();
    int speed;

    public WildAnimals(int weight, int height) {
//        super(weight, height);
//        super();
    }

    public void animalsThatWeEat(String animal) {
        animalThatWeeat.append(animal);
        System.out.println("inside animals that we eat are : " + animalThatWeeat);

    }

    public void bite() {

        System.out.println("hey there");

    }


}
