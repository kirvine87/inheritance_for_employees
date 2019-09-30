package staff.manager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Kyle", 7654321, 50000.00, "Tech", 100000.00);
    }

    @Test
    public void getName(){
        assertEquals("Kyle", director.getName());
    }

    @Test
    public void getNI(){
        assertEquals(7654321, director.getNationalInsurance());
    }

    @Test
    public void getSalary(){
        assertEquals(50000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000.00);
        assertEquals(55000.00, director.getSalary(), 0.01 );
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(1000.00, director.payBonus(), 0.01);
    }

    @Test
    public void getDept(){
        assertEquals("Tech", director.getDeptName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(100000.00, director.getBudget(), 0.01);
    }

}
