package B_InterfacesUpdatesJava8;

/**
 *  #Functional interface
 *  1. Interface which contains only one abstract method
 *  2. Can have any no. of default methods
 *  3. Generally used with Lambdas expression
 *  4. @annotation compiler make sure no other abstract method added to interface
 *
 *  SAM Rule
 *  Single Abstract Method Rule
 */

@FunctionalInterface
interface Testable3 {

    int singleAbstractMethod(int a);
    default void defaultMethod1(){System.out.println("I am default method 1");}
    default void defaultMethod2(){System.out.println("I am default method 2");}
    static void staticMethod1(){System.out.println("I am static method 1");};
    static void staticMethod2(){System.out.println("I am static method 1");};

}

