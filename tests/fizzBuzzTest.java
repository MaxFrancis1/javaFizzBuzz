import org.junit.Test;

import static org.junit.Assert.*;

public class fizzBuzzTest {

    @Test
    public void initiate() {
    fizzBuzz one = new fizzBuzz();
    assertEquals("working", one.test());
    }

}