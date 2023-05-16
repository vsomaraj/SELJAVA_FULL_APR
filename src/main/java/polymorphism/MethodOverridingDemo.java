package polymorphism;


    class Animal{
        void makesound(){
            System.out.println("Animal is making sound");

        }
    }
    class Dog extends Animal{
        void makesound(){
//            super.makesound();
            System.out.println("Dog is Barking");
        }
    }
    class Cat extends Animal{
        void makesound(){
//            super.makesound();
            System.out.println("Cat is meowing");
        }
    }
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal myAnimal=new Animal();
        Dog myDog=new Dog();
        Cat myCat=new Cat();
        myAnimal.makesound();
        myDog.makesound();
        myCat.makesound();
    }
}