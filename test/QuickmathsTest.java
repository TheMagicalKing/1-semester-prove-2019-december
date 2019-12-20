import org.junit.Test;

import static org.junit.Assert.*;

public class QuickmathsTest {

    @Test
    public void testSum() {
        // TODO Din kode her
        Quickmaths sumTest = new Quickmaths();
        assertEquals(17,sumTest.sum(10,7));
        assertEquals(55, sumTest.sum(50,5));
        assertEquals(100,sumTest.sum(50,50));
        assertEquals(100,sumTest.sum(75,25));
    }

    @Test
    public void testGennemsnit() {
        // TODO Din kode her
        Quickmaths averageTest = new Quickmaths();
        assertEquals(75,averageTest.gennemsnit(100,50));
        assertEquals(42,averageTest.gennemsnit(25,60));
        assertEquals(68,averageTest.gennemsnit(75,62));
        assertEquals(106,averageTest.gennemsnit(68,145));
    }

}