package Generics;

public class G_GenericClass<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


    private static void generics1() {
        G_GenericClass<String> obj1 = new G_GenericClass<>();
        obj1.setT("hello");
        System.out.println("String Type: "+obj1.getT());


        G_GenericClass<Integer> obj2 = new G_GenericClass<>();
        obj2.setT(50);
        System.out.println("Integer Type: "+obj2.getT());
    }


    /**
     * Not recommended use of generics
     */
    private static void generics2() {
        @SuppressWarnings("rawtypes")
        G_GenericClass obj = new G_GenericClass();
        obj.setT("abc");
        obj.setT(10);
        System.out.println(obj.getT());
    }


    public static void main(String[] args) {
        generics1();
        generics2();
    }
}
