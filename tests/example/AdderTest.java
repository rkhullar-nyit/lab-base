package example;

import org.junit.Test;
import static org.junit.Assert.*;


public class AdderTest
{
    @Test
    public void test_adder_1()
    {
        Adder adder = new Adder();
        int y = adder.add(1, 2);
        int e = 3;
        assertEquals(e, y);
    }

    @Test
    public void test_adder_2()
    {
        Adder adder = new Adder();
        int y = adder.add(6, 4);
        int e = 10;
        assertEquals(e, y);
    }
}
