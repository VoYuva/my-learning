package AnimalNameAge;

public class Main {
    public static void main(String[] args) {
        String animalName = "Vasya";
        int animalAge = 12;
        AnimalAge sayAge = new AnimalAge(animalName, animalAge);
        sayAge.say();
        AnimalName sayName = new AnimalName(animalName, animalAge);
        sayName.say();
    }
}
