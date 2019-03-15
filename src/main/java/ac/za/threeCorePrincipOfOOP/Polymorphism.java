package ac.za.threeCorePrincipOfOOP;

public class Polymorphism {
    public void animalSound2(){
        System.out.println("Default Sound");
    }

}

class Dog2 extends Polymorphism {

    public void animalSound2(){
        System.out.println("Woof, default sound");
    }
    public static void main(String args[]){
        Polymorphism  obj = new Dog2();
        obj.animalSound2();
    }
}