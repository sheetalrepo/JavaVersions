package C_LambdaExp;

/**
 * In case interface method implementation is having multiple line
 *  - return statement in mandatory
 *  - {} mandatory
 * 
 * @author Sheetal Singh
 */
public class A_LambdaMultiLineEg {
    public static void main(String[] args) {
        System.out.println("============================================");
        
        IStringLength obj = s -> {               //Interface method implementation
            String str = s.replaceAll("[^a-zA-Z]","");
            int len = str.length();          
            return len;                          //mandatory return
        };                                       //mandatory {}
      
        System.out.println("String length: "+obj.getLength("# Hello World !!!"));
        System.out.println("============================================");
            
    }
}
