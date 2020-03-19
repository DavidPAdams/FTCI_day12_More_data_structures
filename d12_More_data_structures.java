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

    Integer howMany = animals.size();
    System.out.printf("My LinkedList of animals has %d entries\n", howMany);

    System.out.printf("The animal at index 3 is %s\n", animals.get(3));

  }
}


// Queue is an interface, not an object
// first in first out
import java.util.LinkedList;
import java.util.Queue;

class Main {

  public static void main(String[] args) {
    Queue<Integer> bbq = new LinkedList<Integer>();
    for(int i = 1; i < 7; i++) bbq.add(i);

    System.out.println(bbq);

    Integer hat = bbq.remove();
    System.out.printf("removed head element: %d\n", hat);

    System.out.println(bbq);

    Integer look = bbq.peek();
    System.out.printf("the head element looks like %d\n", look);

    System.out.println(bbq);

    Integer num = bbq.size();
    System.out.printf("the size is: %d\n", num);
  }
}


// Stack
// last in first out

class Main {

  public static void main(String[] args) {
    Stack<String> strStack = new Stack<String>();
    
    strStack.push("apple");
    strStack.push("banana");
    strStack.push("cherry");

    System.out.println(strStack);

    System.out.println(strStack.peek());

    System.out.println(strStack.empty());

    System.out.println(strStack);

    System.out.println(strStack.pop());

    System.out.println(strStack);

    System.out.println(strStack.search("banana"));
  }
}

