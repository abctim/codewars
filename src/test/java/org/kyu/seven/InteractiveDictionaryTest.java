package org.kyu.seven;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InteractiveDictionaryTest {
    @Test
    public void Tests()
    {
        InteractiveDictionary d = new InteractiveDictionary();

        d.newEntry("Apple", "A fruit");
        assertEquals("A fruit", d.look("Apple"));

        d.newEntry("Soccer", "A sport");
        assertEquals("A sport", d.look("Soccer"));

        assertEquals("Cant find entry for Hi", d.look("Hi"));
        assertEquals("Cant find entry for Ball", d.look("Ball"));

        d.newEntry("soccer", "a sport");
        assertEquals("a sport", d.look("soccer"));
    }
}
