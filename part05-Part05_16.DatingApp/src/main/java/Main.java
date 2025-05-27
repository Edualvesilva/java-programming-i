
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate test = new SimpleDate(29,12,2005);
        test.advance();
        test.advance();
        System.out.println(test);
        
        SimpleDate test2 = new SimpleDate(20,03,2005);
        test2.advance(9);
        System.out.println(test2);
        
        
    }
}
