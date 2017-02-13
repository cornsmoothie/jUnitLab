
package junitdayslab;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestUnit {
    
    Date d1 = new Date(2010 , 12 , 25);
    Date d2 = new Date(2009 , 12 , 25);
    
    /*
    Expected- 1:365  |  2:365  | 3:0  |  4:365
    Expected Output - Fail | Fail | Pass | Pass
    Output- Fail | Fail | Pass | Pass
    */
    
    @Test
    public void test1() {
        assertEquals(20 , d1.daysTo(d2));
        }
    @Test
    public void test2() {
        assertEquals(20 , d2.daysTo(d1));
    }
    @Test
    public void test3() {
        assertEquals(0 , d1.daysTo(d1));
    }
    @Test
    public void test4() {
        assertEquals(365 , d2.daysTo(d1));
    }
    
}
