import org.junit.Test;

import static org.junit.Assert.*;

public class fizzBuzzTest {

    @Test
    public void initiate() {
        fizzBuzz one = new fizzBuzz();
        assertEquals("working", one.test());
    }

    @Test
    public void testItPrintsNumbers() {
        fizzBuzz two = new fizzBuzz();
        int[] input = {2};
        String result = two.run(input);
        assertEquals("2", result);
    }

    @Test
    public void testItPrintsMultipleNumbersAndFizzBuzz() {
        fizzBuzz two = new fizzBuzz();
        int[] input = {2, 5, 3, 15};
        String result = two.run(input);
        assertEquals("2 Fizz Buzz FizzBuzz", result);
    }
}
