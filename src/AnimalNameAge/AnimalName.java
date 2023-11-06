package AnimalNameAge;

public class AnimalName implements IAnimal{
    String animalName;
    int animalAge;
    public AnimalName(String animalName, int animalAge){
        this.animalName = animalName;
        this.animalAge = animalAge;
    }
    public void say(){
        System.out.println("This animal is cat, its name is " + animalName);
    }
}