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








}
