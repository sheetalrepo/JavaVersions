package E_Streams;
import java.util.Comparator;
import java.util.stream.Stream;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
public class I_ABC {
    public static void main(String[] args) {
        //doSorted2();
        //doLimit();
        doSortedOther();
    }
    public static void doSortedOther() {

        // Stream<T> sorted()
        // Stream<T> sorted(Comparator<T> comparator)
        // Output:
        //  0.Tim 1.Tim 0.Jim 1.Jim 0.Peter 0.Ann 1.Ann 0.Mary 2.Ann 3.Ann 2.Jim 3.Jim
        Stream.of("Tim", "Jim", "Peter", "Ann", "Mary")
                .peek(name -> System.out.print(" 0."+name))    // Tim, Jim, Peter, Ann, Mary
                .filter(name -> name.length() == 3)
                .peek(name -> System.out.print(" 1."+name))    // Tim, Jim, Ann
                .sorted()                                      // Tim, Jim, Ann (stored)
                .peek(name -> System.out.print(" 2."+name))    // Ann, Jim
                .limit(2)
                .forEach(name -> System.out.print(" 3."+name));// Ann, Jim

    }

    public static void doSorted2() {

        // Stream<T> sorted(Comparator<T> comparator)
        // Output:
        //   Person{name=John, age=23}Person{name=Mary, age=25}
        Person john = new Person("John", 23);
        Person mary = new Person("Mary", 25);
        Stream.of(mary,john)
                //.sorted(Comparator.comparing(Person::getAge))
                .sorted(Comparator.comparing(p -> p.getAge()))
                .forEach(System.out::print);

    }
   
    


}
