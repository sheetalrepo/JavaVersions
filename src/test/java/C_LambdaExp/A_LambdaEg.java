package C_LambdaExp;

/**
 * Lambda Expression
 * 
 * @author Sheetal Singh
 */
public class A_LambdaEg {
    public static void main(String[] args) {
        System.out.println("============================================");
        //Single Argument Method
        IStringLength obj = s -> s.length();          //Interface method implementation 
        //IStringLength obj = (String s) -> s.length();
        //IStringLength obj = (s) -> s.length();
        System.out.println("String length: "+obj.getLength("Hello World"));
        System.out.println("============================================");
        
        
        //Multiple Argument Methods
        //ISumable obj2 = (i,j) -> i+j;
        ISumable obj2 = (int i,int j) -> i+j;
        System.out.println("Sum of two number: "+obj2.sum(10,20));
        System.out.println("============================================");
        
            
    }
}
