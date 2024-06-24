public class Person {
    private String name;
    private int age;
 
    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    // Compare two persons by age and print the senior-most person's details
    public static void printSeniorMost(Person person1, Person person2) {
        if (person1.age > person2.age) {
            System.out.println(person1.name + " is senior-most with age " + person1.age);
        } else if (person2.age > person1.age) {
            System.out.println(person2.name + " is senior-most with age " + person2.age);
        } else {
            System.out.println(person1.name + " and " + person2.name + " are of the same age.");
        }
    }
 
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 48);
        Person person2 = new Person("Bob", 30);
 
        printSeniorMost(person1, person2);
    }
}