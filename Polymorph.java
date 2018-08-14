public class Polymorph
 {
    public static void main(String[] args)
	{
        Animal obj1 = new Dog();
        Animal obj2 = new Cat();
		Animal obj3 = new Horse();
        obj1.shout(); // Dog shouts
        obj2.shout(); // Cat shouts
		obj3.shout(); // Horse shouts
}
}

class Animal
{
    public void shout()
	{
        System.out.println("Animal shout");
    }       
}

class Dog extends Animal{
    public void shout(){
        System.out.println("bark..");
    }
}

class Cat extends Animal{
    public void shout(){
        System.out.println("Meow..");
    }
}

class Horse extends Animal{
    public void shout(){
        System.out.println("neigh....");
    }
}

