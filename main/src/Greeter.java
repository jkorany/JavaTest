/**
 * A class for producing simple greetings. Created by Joe Korany on 2/6/2015.
 */
public class Greeter {
    /**
     * Constructs a Greeter object that can greet a person or entity.
     * @param aName the name of the person or entity.
     */
    public Greeter(String aName) {
        name = aName;
    }

    /**
     * Greets with a "Hello" message.
     * @return a message greeting the person.
     */
    public String sayHello() {
        return "Hello, " + name + "!";
    }

    private String name;
}

