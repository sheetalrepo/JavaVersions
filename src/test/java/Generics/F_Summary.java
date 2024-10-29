package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

class Animal{}
class Dog extends Animal {}
class Puppy extends Dog {}
class Cat extends Animal {}
class Kitten extends Cat{}


public class F_Summary {

    /**
     * Any class below Animal
     */
    private static void extendExample() {
        //"extends" - polymorphic assignments
        List<? extends Animal> animals1 = new ArrayList<Animal>();
        //animals1.add(new Animal());   //Read Only, Nothing can be added
        List<? extends Animal> animals2 = new ArrayList<Dog>();
        List<? extends Animal> animals4 = new ArrayList<Puppy>();
        List<? extends Animal> animals3 = new ArrayList<Cat>();
        List<? extends Animal> animals5 = new ArrayList<Kitten>();
        //List<? extends Animal> animals6 = new ArrayList<Object>(); Object is higher than Animal
    }

    /**
     * Any Class above Dog
     */
    private static void superExample() {
        //"super" - polymorphic assignments
        List<? super Dog> dogs1 = new ArrayList<Dog>();
        dogs1.add(new Dog()); //Allowed to add
        List<? super Dog> dogs2 = new ArrayList<Animal>();
        List<? super Dog> dogs3 = new ArrayList<Object>();
        //List<? super Dog> dogs4 = new ArrayList<Puppy>();
        //List<? super Dog> dogs5 = new ArrayList<Cat>();
        //List<? super Dog> dogs5 = new ArrayList<Kitten>();
    }

  

    public static void main(String[] args) {
        extendExample();
        superExample();
    }
}
