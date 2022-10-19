package hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        assertThat(greeter.sayHello(), containsString("Hello"));
    }

    @Test
    public void greeterSaysHelloName() {
        assertThat(greeter.sayHello("Annalisa"), containsString("Annalisa"));
    }
}