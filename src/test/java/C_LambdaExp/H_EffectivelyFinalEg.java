package C_LambdaExp;

/**
 * Effectively final variable:
 *  - Var whose value doesn’t change after it’s first assigned. 
 *  - There is no need to explicitly declare such a variable as final 
 *  - Although doing so would not be an error.
 * 
 * Any var used inside Lambda function will be treated as Effectively final or Final
 * We cannot modify any Effectively final or Final var
 * 
 * @author Sheetal Singh
 */
public class H_EffectivelyFinalEg {

    private static void finalVar() {
        final String fruit1 = "Mango";     //Final Variable
        //fruit = "Sweet "+ fruit;         //Compiler Error: final var cannot be reassigned
        System.out.println(fruit1);

        String fruit2 = "Orange";          //Normal Variable
        fruit2 = "Sweet "+ fruit2;         
        System.out.println(fruit2);

        System.out.println("============================================");
    }
    
    private static void normalLambdaFunction() {
        IStringModify obj = s -> {
            String gm = "Good Morning, "+s;
            return gm ;
        };

        System.out.println("With Salutation: "+obj.addGMSalutation("John"));
        System.out.println("============================================");
    }


    private static void effectivelyFinalLambdaFunction() {
        String gm = "John";                     //Not declared Final, but still its final incase need to use in lambda
        
        IStringModify obj = s -> {
            //gm = "Good Morning, "+s;          //Compiler Error: var treated as "Final" and cannot be reassigned
            return gm ;                         // In case we not use "gm" var then it will be a normal string
        };
        System.out.println("Effectively Final: "+ gm);

        //gm = "Bob";                            //Compiler Error:var cannot be modified inside or outside lambda expression 
        System.out.println("Effectively Final: "+ gm);
        
        System.out.println("============================================");
    }
    
    
    public static void main(String[] args) {
        finalVar();
        normalLambdaFunction();
        effectivelyFinalLambdaFunction();
    }
}