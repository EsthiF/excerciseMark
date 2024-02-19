// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Animal animalOne= new Tiger();
        Animal animalTwo= new Lion();
        Animal animalThree= new BabyTiger();

        animalOne.makeSound();
        animalOne.eat();
        animalOne.sleep();
        animalOne.breath();
        animalOne.run();
        animalTwo.makeSound();
        animalTwo.eat();
        animalTwo.sleep();
        animalTwo.breath();
        animalTwo.run();
        animalThree.breath();
        animalThree.makeSound();
    }
}