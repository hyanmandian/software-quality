package School;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class SchoolTest {
       
    private School school;

    @Before
    public void setUp() throws Exception {
        this.school = new School();
    }
    
    @Test
    public void should8WhenAvgOf8And8And8() {
        double expected = 8;
        double actual = this.school.avg(8, 8, 8);
        
        assertEquals(0, Double.compare(expected, actual));
    }
    
    @Test
    public void shouldApprovedWhenAvgGreaterOrEquals7() {
        String expected = "Approved!";
        String actual = this.school.getStudentStatus(7, 7, 7);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void shouldInExaminationWhenAvgGreaterOrEquals5AndLessThan6Dot9() {
        String expected = "In examination!";
        String actual = this.school.getStudentStatus(6.9, 6.9, 6.9);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void shouldDisapprovedWhenAvgLessThan5() {
        String expected = "Disapproved!";
        String actual = this.school.getStudentStatus(4.9, 4.9, 4.9);
        
        assertEquals(expected, actual);
    }
    
}
