//package hello;

import org.junit.Test;

import static org.junit.Assert.fail;

public class HelloTest {

    @Test
    public void testNothing() {
    }

    @Test
    public void testWillAlwaysFail() {
        fail("An error message");
    }


}
