package AnimalNameAge;

public class AnimalAge implements IAnimal{
    String animalName;
    int animalAge;
    public AnimalAge(String animalName, int animalAge){
        this.animalName = animalName;
        this.animalAge = animalAge;
    }
    public void say(){
        System.out.println("This animal is cat, its age is " + animalAge);
    }
}
