/**
 * Created by Joe Korany on 2/6/2015.
 */
public class GreeterTest {
    public static void main(String[] args) {
        Greeter worldGreeter = new Greeter("World");
        String greeting = worldGreeter.sayHello();
        System.out.println(greeting);
        Greeter newGreeter = null;
        try {
            newGreeter.sayHello();
        }
        catch(Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
        String test = "Test";
        String s = test;
        s = s + " does this work?";
        System.out.println(s);
        System.out.println(test);
        
    }

}

