package D_MethodRef;

/**
 * Context:
 *  1. Context is very important in Lambda and Method Reference:
 *  2. Context defined the output e.g what we are using Supplier, Function, BiFunction etc
 *  
 * @author Sheetal Singh
 */
public class F_LambdaMethodRefContext {

/*    
    class Person{
        public static Integer howMany(Person... people){   //Need JDK 16+
            return people.length;
        }
    }
    
    public static void main(String[] args) {
        //Supplier - 0 input
        Supplier<Integer> lambda1 = () -> Person.howMany();   //0 Person passed, 0 output
        Supplier<Integer> mr1     = Person::howMany;
        System.out.println(lambda1.get());  
        System.out.println(mr1.get());     

        //Function - 1 input
        Function<Person, Integer> lambda2 = person -> Person.howMany(person);  //1 Person passed, 1 output
        Function<Person, Integer> mr2     = Person::howMany;
        System.out.println(lambda2.apply(new Person())); 
        System.out.println(mr2.apply(new Person()));      

        //BiFunction - 2 input
        BiFunction<Person, Person, Integer> lambda3 = (p1, p2) -> Person.howMany(p1, p2); //2 Person passed, 2 output
        BiFunction<Person, Person, Integer> mr3     = Person::howMany;
        System.out.println(lambda3.apply(new Person(), new Person()));  
        System.out.println(mr3.apply(new Person(), new Person()));      
    }
    
 */
}