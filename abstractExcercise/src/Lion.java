public class Lion extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Roar I am a Lion");
    }
    @Override
    public void eat() {
        System.out.println("I eat only meat");
    }
    @Override
    public void sleep() {
        System.out.println("I sleep during the day");
    }
    @Override
    public void run(){
        System.out.println("I can run very quick");
    }
}
