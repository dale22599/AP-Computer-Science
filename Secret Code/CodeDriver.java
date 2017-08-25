/**
 * Tests that the Code class is properly implemented
 */
public class CodeDriver
{
    public static void main(String[] args)
    {            
        CodeArray code = new CodeArray("ABCdef123ghi456jklMNO");
        
        code.hide(2, 7);
        System.out.println(code);
        
        code.recover(5, 9);
        System.out.println(code);
        
        code.hide(3, 14);
        System.out.println(code);
        
        code.hide(6, 10);
        System.out.println(code);
        
        code.recover(5, 6);
        System.out.println(code);
        
        code.recover(0, 14);
        System.out.println(code);
    }   
}
