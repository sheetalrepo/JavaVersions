package B_InterfacesUpdatesJava8;

interface Testable2 {
    
    public default void methodWithBody() {
        System.out.println("Testable 2: Default method introduced in Java8");
    }

}

