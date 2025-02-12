public class Lab1 {
}
// Exercise 1
public class Main {
    public static void main(String[]args){
        System.out.println("Hello World!");
    }
}
// Exercise 2
public class Main {
    public static void main(string[] args) {
        int x = 10;
        string message = "The number is";

        System.out.println(message + " " + x);
    }
}
//Exercise 3
public class EvenOddChecker {
    public static void main(String[] args) {
        int number = 15;

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
//Exercise 4
public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
//Exercise 5
public class Greeting {
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(greet("Alice"));
    }
}
//Exercise 6
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String greet() {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        Person p = new Person("Bob");

        System.out.println(p.greet());
    }
}
//Exercise 7
public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
//Exercise 8
public class ErrorHandlingExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }
}