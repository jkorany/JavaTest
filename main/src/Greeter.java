/**
 * Created by Joe Korany on 2/6/2015.
 */
public class Greeter {
    public Greeter(String aName) {
        name = aName;
    }

    public String sayHello() {
        return "Hello, " + name + "!";
    }

    private String name;
}

