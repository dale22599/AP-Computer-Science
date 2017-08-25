/**
 * Tests that the Code class is properly implemented
 */
public class CodeDriverOld
{
    public static void main(String[] args)
    {
        Code code = new Code("ABCdef123ghi456jklMNO");
    
        code.hide(2, 7);
        System.out.println(code);   // should output ABXXXXX23ghi456jklMNO
        
        code.recover(5, 9);
        System.out.println(code);   // should output ABXXXf123ghi456jklMNO
        
        code.hide(3, 14);
        System.out.println(code);   // should output ABXXXXXXXXXXXX6jklMNO
        
        code.hide(6, 10);
        System.out.println(code);   // should output ABXXXXXXXXXXXX6jklMNO
        
        code.recover(5, 6);
        System.out.println(code);   // should output ABXXXfXXXXXXXX6jklMNO
        
        code.recover(0, 14);
        System.out.println(code);   // should output ABCdef123ghi456jklMNO
    }
   
}
