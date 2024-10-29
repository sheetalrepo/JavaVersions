
#Functional Interface:

#Interface      method()                    Purpose

Predicate       boolean test(T t);          Verify given condition and return true/false
BiPredicate     boolean test(T t, U u);     Verify given condition (no hard coding) and return true/false

Supplier        T get();                    Used to get values only
Consumer        void accept(T t);           Used to accept value only
BiConsumer      void accept(T t, U u);      Used to accept two values

Function        R apply(T t);               Used to do some calculation on input and return output   
BiFunction      R apply(T t, U u);          Used to do some calculation on two input and return output
