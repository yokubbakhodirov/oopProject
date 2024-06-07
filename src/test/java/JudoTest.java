import com.company.martialArts.Judo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JudoTest {
    private Judo judo;

    @Before
    public void setUp() {
        judo = new Judo();
    }

    @Test
    public void testInitialization() {
        assertEquals("Judo", judo.getName());
        assertEquals("Judo: numOfThrows = 0", judo.getReport());
    }

    @Test
    public void testMakeMove() {
        judo.makeMove();
        assertEquals("Judo: numOfThrows = 1", judo.getReport());

        judo.makeMove();
        assertEquals("Judo: numOfThrows = 2", judo.getReport());
    }

    @Test
    public void testGetReport() {
        assertEquals("Judo: numOfThrows = 0", judo.getReport());

        judo.makeMove();
        assertEquals("Judo: numOfThrows = 1", judo.getReport());

        for (int i = 0; i < 10; i++) {
            judo.makeMove();
        }
        assertEquals("Judo: numOfThrows = 11", judo.getReport());
    }
}
