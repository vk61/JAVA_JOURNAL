import java.util.List;

interface Animal
{
    void eat();

}
class Dog implements Animal {
    @Override
    public void eat(){
        System.out.println("Dog eating");
    }
}

class Cat implements Animal {
    @Override
    public void eat(){
        System.out.println("Cat eating");
    }
}
public class TestGenerics1 {
  public static void main(String[] args) {

    List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
    takeAnimals(animals);

  }

  public static void takeAnimals(List<Animal> animals) {
    for (Animal a : animals) {
      a.eat();
    }
  }
}

 class TestGenerics2 {
  public static void main(String[] args) {

    List<Animal> dogs = List.of(new Dog(), new Dog(), new Dog());
    takeAnimals(dogs);

  }

  public static void takeAnimals(List<? extends Animal> animals) {
    for (Animal a : animals) {
      a.eat();
    }
    
  }
}