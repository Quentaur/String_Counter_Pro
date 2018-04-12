
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class TestStringCounter {

    StringCounter strCount = new StringCounter();
    List<String> testList = new ArrayList<String>(
            Arrays.asList("mmmm", "Mongrel", "money", "BigM", "homer"));

    @Test
    public void testCountMatch(){

        assertEquals(3, strCount.countMatches("^[Mm]", testList));
    }
}
