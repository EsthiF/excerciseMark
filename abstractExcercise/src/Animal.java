public abstract class Animal {
    public abstract void makeSound();
    public abstract void eat();
    public abstract void sleep();
    public final void breath(){
        System.out.println("Animal is breathing");}

    public void run(){
        System.out.println("I can run");
    }
    }