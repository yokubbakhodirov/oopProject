import com.company.martialArts.Karate;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KarateTest {
    private Karate karate;

    @Before
    public void setUp() {
        karate = new Karate();
    }

    @Test
    public void testInitialization() {
        assertEquals("Karate", karate.getName());
        assertEquals("Karate: numOfPunch = 0, numOfKick = 0", karate.getReport());
    }

    @Test
    public void testMakeMove() {
        karate.makeMove();
        assertEquals("Karate: numOfPunch = 1, numOfKick = 1", karate.getReport());

        karate.makeMove();
        assertEquals("Karate: numOfPunch = 2, numOfKick = 2", karate.getReport());
    }

    @Test
    public void testGetReport() {
        assertEquals("Karate: numOfPunch = 0, numOfKick = 0", karate.getReport());

        karate.makeMove();
        assertEquals("Karate: numOfPunch = 1, numOfKick = 1", karate.getReport());

        for (int i = 0; i < 10; i++) {
            karate.makeMove();
        }
        assertEquals("Karate: numOfPunch = 11, numOfKick = 11", karate.getReport());
    }
}
