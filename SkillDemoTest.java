import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest{
    int[] testInt;
    int avg;
    
    @Before
    public void setUp() throws Exception {
        testInt = new int[]{1, 2, 3, 4, 5, 6};
    }

    @Test
    public void testAverageMethod() {
        SkillDemo testObj = new SkillDemo(testInt);
        assertEquals("21/6", 3.5, testObj.average(testInt), .01);
    }
}
