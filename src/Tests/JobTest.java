package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class JobTest {

    Job  job1;
    Job  job2;
    Job  job3;
    Job  job4;
    Job  job5;

@Before
    public void createJobObject(){

    job1 = new Job();
    job2 = new Job();
    job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    job4 = new Job("Front end developer", new Employer("IBM"), new Location("Arkansas"), new PositionType(" Developer"), new CoreCompetency("Javascript"));
    job5 = new Job("Front end developer", new Employer("IBM"), new Location("Arkansas"), new PositionType(" Developer"), new CoreCompetency("Javascript"));
}

    @Test
    public void testSettingJobId() { assertTrue(  job2.getId() - job1.getId() == 1); }

    @Test
    public void testJobConstructorSetsAllFields() {

        assertEquals("Product tester",job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert",job3.getLocation().getValue());
        assertEquals("Quality control",job3.getPositionType().getValue());
        assertEquals("Persistence",job3.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality() {
//  Should be false
        System.out.println(job4.equals(job5));
    }

    @Test
    public void testFirstAndLastLineToString() {
//  Should return true
        job3.toString();
        char firstChar = job3.toString().charAt(0);
        char lastChar = job3.toString().charAt(job3.toString().length() - 1);

        assertTrue(firstChar == lastChar);

    }

    @Test
    public void testFieldsAndData() {

       String format =
               "\n Id: " + job3.getId() +
               "\n Name: " + job3.getName()  +
               "\n Employer: " + job3.getEmployer() +
               "\n Location: " + job3.getLocation() +
               "\n PositionType: " + job3.getPositionType() +
               "\n CoreCompetency: " + job3.getCoreCompetency() +
               "\n";

        assertEquals(format,job3.toString());

    }

    }







