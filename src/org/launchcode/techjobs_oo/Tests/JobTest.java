package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job job1;
    Job job2;
    Job job3;
    Job job4;
    Job job5;



    @Before
    public void createNewJob () {

        //Create two Job objects using the empty constructor.
        job1 = new Job();
        job2 = new Job();

        //Declare and initialize a new Job object with the following data:
        job3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));


    }
    //Test the Empty Constructor
    @Test
    public void testSettingJobId () {
        //test that the ID values for the two objects are NOT the same and differ by 1.
        assertTrue(job1.getId() != job2.getId());
        assertEquals(job2.getId(), job1.getId() + 1);

    }

    //Test the Full Constructor
    @Test
    public void  testJobConstructorSetsAllFields () {

        //Use assert statements to test that the constructor correctly assigns the class and value of each field.
        assertEquals(job3.getName(), "Product tester");
        assertEquals(job3.getEmployer().getValue(), "ACME");
        assertEquals(job3.getLocation().getValue(), "Desert");
        assertEquals(job3.getPositionType().getValue(), "Quality control");
        assertEquals(job3.getCoreCompetency().getValue(), "Persistence");

        assertTrue(job3.getName().contains("Product tester"));
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality () {

        //Generate two Job objects that have identical field values EXCEPT for id. Test that equals returns false.
        job4 = new Job("SCRUM Master",
                new Employer("Centene"),
                new Location("St. Louis"),
                new PositionType("Business Analyst"),
                new CoreCompetency("Communication"));

        job5 = new Job("SCRUM Master",
                new Employer("Centene"),
                new Location("St. Louis"),
                new PositionType("Business Analyst"),
                new CoreCompetency("Communication"));

        //Test that equals returns false.

        assertFalse(job4.equals(job5));
    }


}
