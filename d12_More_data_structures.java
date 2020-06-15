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

    System.out.println("Is a toad in the linked list? " + animals.contains("toad"));

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
    // Queue<Integer> badQ = new Queue<Integer>(); // THIS WON'T WORK!!!
    for(int i = 1; i < 7; i++) bbq.add(i);

    System.out.println(bbq);

    Integer hat = bbq.remove(); // it's 'hat' becaue it's the head element...
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
import java.util.Stack;

class Main {

  public static void main(String[] args) {
    Stack<String> fruitStack = new Stack<String>();

    System.out.println(fruitStack.capacity());

    for(Integer i = 0; i < 15; i++){
      fruitStack.push(i.toString());
    }

    System.out.println(fruitStack.capacity());

    fruitStack.push("apple");
    fruitStack.push("banana");
    fruitStack.push("cherry");

    System.out.println(fruitStack.capacity());

    System.out.println(fruitStack);

    System.out.println(fruitStack.peek());

    System.out.println(fruitStack.empty());
    
    System.out.println(strStack.pop());

    System.out.println(strStack);

    System.out.println(fruitStack.search("banana"));

  }
}


//Some extra examples with arrays
//try leaving out the import to see the error message
import java.util.Arrays;

class Main {

  public static void main(String[] args) {

    int[] numbers = {3, 5, 7, 44, 65, 23};

    System.out.println(Arrays.toString(numbers)); 
    //look in the inheritance list on Oracle documentation 
    //to find where it gets the .toString() method for Arrays, 
    //click the link to read about usage and pay attention to the source

    int sum = 0;

    for(int thingy : numbers){
      sum += thingy;
    }

    System.out.println(sum);

    // for this try to think it through and predict what the result will be
    long[] exampleArray = {1, 5, 6, 5, 4, 1};
    long maximum = exampleArray[0];
    int index = 0;
    for(int i = 1; i<exampleArray.length; i++){
      if (exampleArray[i] > maximum) {
        maximum = exampleArray[i];
        index = i;
      }
    }
    System.out.println(index);

  }
}

