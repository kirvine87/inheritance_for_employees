package staff.manager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manger;

    @Before
    public void setUp(){
        manger = new Manager("Janet", 2384384, 25000.00, "Finance");
    }

    @Test
    public void getName(){
        assertEquals("Janet", manger.getName());
    }

    @Test
    public void getNI(){
        assertEquals(2384384, manger.getNationalInsurance());
    }

    @Test
    public void getSalary(){
        assertEquals(25000.00, manger.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        manger.raiseSalary(5000.00);
        assertEquals(30000.00, manger.getSalary(), 0.01 );
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(250.00, manger.payBonus(), 0.01);
    }

    @Test
    public void getDept(){
        assertEquals("Finance", manger.getDeptName());
    }

    @Test
    public void cantRaiseSalaryByNegative(){
        manger.raiseSalary(-5000.00);
        assertEquals(25000.00, manger.getSalary(), 0.01 );
    }

    @Test
    public void cantChangeNameToNull(){
        manger.setName("");
        assertEquals("Janet", manger.getName());
    }

    @Test
    public void canChangeName(){
        manger.setName("Janice");
        assertEquals("Janice", manger.getName());
    }


}
