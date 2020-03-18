// Use this code in a tool like repl.it
// to experiment with Java

// LinkedList
import java.util.LinkedList;

class Main {

  public static void main(String[] args) {
    LinkedList<String> animals = new LinkedList<String>();
    animals.add("cat");
    animals.add("snake");
    animals.add("ferret");
    animals.add("horse");
    animals.add("elephant");

    System.out.println(animals);

    animals.addFirst("dog");
    animals.addLast("hamster");

    System.out.println(animals);

    animals.add(2, "beta fish");

    for(String animal : animals) System.out.println(animal);

    animals.remove(2);
    animals.add(2, "alligator");

    System.out.println(animals);

    animals.add(2, "toad");

    System.out.println(animals);

    animals.add(0, "skunk");

    System.out.println(animals);

    animals.removeFirst();

    System.out.println(animals);

    animals.add("black mamba");

    System.out.println(animals);

    animals.removeLast();

    System.out.println(animals);

    System.out.println("A toad in the linked list? " + animals.contains("toad"));

    
  }
}



