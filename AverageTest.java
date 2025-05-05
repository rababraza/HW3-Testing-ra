import static org.junit.Assert.*;
import org.junit.Test;

public class AverageTest {

	
    @Test
    public void aListEmptyTesting() {
        Average avg = new Average();
        int[] list = {};
        assertEquals(0, avg.average(3, list));
    }
 
    @Test
    public void ifKZeroTesting() {
        Average avg = new Average();
        int[] list = {10, 20, 30};
        assertEquals(0, avg.average(0, list));
    }

    @Test
    public void ifKOneTesting() {
        Average avg = new Average();
        int[] list = {10};
        assertEquals(10, avg.average(1, list));
    }
    
    @Test
    public void ifKEqualsLengthTesting() {
        Average avg = new Average();
        int[] list = {2, 4, 6};
        assertEquals(4, avg.average(3, list)); 
    }
    
    @Test
    public void ifKLessThanLengthTesting() {
        Average avg = new Average();
        int[] list = {4, 6, 8};
        assertEquals(5, avg.average(2, list)); 
    }
    
    @Test
    public void ifKGreaterThanLengthTesting() {
        Average avg = new Average();
        int[] list = {3, 9, 6};
        assertEquals(6, avg.average(7, list)); 
    }


}
