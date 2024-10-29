package B_InterfacesUpdatesJava8;



interface Testable1 {
    void abstractMethodOld();  //Public + Abstract

    
    
    /**
     * Default Concrete Method: 
     *      1. These new Java 8 methods will not impact existing old classes
     */
    public default void defaultMethodNew() {
        System.out.println("Testable 1: Default method introduced in Java8");
    }
    
    

    /**
     * Static Concrete Method: 
     *      1. Can be called with Interface name only
     *      2. Cannot be overridden by Class
     */
    public static void staticMethodNew() {
        System.out.println("Static method introduced in Java8");
    }


}
