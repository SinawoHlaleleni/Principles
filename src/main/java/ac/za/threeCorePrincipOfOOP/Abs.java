package ac.za.threeCorePrincipOfOOP;

abstract class Abs {
    //abstract method
    public abstract void animalSound();
}
class Dog extends Abs{

    public void animalSound(){
        System.out.println("Woof");
    }
    public static void main(String args[]){
        Abs obj = new Dog();
        obj.animalSound();
    }
}