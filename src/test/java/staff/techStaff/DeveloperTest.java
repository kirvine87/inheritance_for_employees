package staff.techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Kevin", 345678, 36000.00);
    }

    @Test
    public void getName(){
        assertEquals("Kevin", developer.getName());
    }

    @Test
    public void getNI(){
        assertEquals(345678, developer.getNationalInsurance());
    }

    @Test
    public void getSalary(){
        assertEquals(36000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(5000.00);
        assertEquals(41000.00, developer.getSalary(), 0.01 );
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(360.00, developer.payBonus(), 0.01);
    }

}
