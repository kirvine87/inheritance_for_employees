package staff.techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Stephen", 1234567, 42000.00);
    }

    @Test
    public void getName(){
        assertEquals("Stephen", databaseAdmin.getName());
    }

    @Test
    public void getNI(){
        assertEquals(1234567, databaseAdmin.getNationalInsurance());
    }

    @Test
    public void getSalary(){
        assertEquals(42000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(10000.00);
        assertEquals(52000.00, databaseAdmin.getSalary(), 0.01 );
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(420.00, databaseAdmin.payBonus(), 0.01);
    }

}
