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
    Job job6;

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

        //Use assert statements to test that the constructor correctly assigns value of each field.
        assertEquals(job3.getName(), "Product tester");
        assertEquals(job3.getEmployer().getValue(), "ACME");
        assertEquals(job3.getLocation().getValue(), "Desert");
        assertEquals(job3.getPositionType().getValue(), "Quality control");
        assertEquals(job3.getCoreCompetency().getValue(), "Persistence");


        //Use assert statements to test that the constructor correctly assigns the class
        assertTrue(job3.getName().contains("Product tester"));
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality () {

        //Generate two Job objects that have identical field values EXCEPT for id.

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


    //It should return a string that contains a blank line before and
    //after the job information

    @Test
    public void testToStringContainsABlankLineBeforeAndAfterJobInfo() {
        assertTrue(job3.toString().indexOf("\n") == 0);
        assertEquals(job3.toString().lastIndexOf("\n") , (job3.toString().length()-1));
    }

    //It should contain a label for each field,
    // followed by the data stored in that field.
    // Each field should be on its own line.
    @Test
    public void testToStringContainsLabelsAndDataForEachField() {
        assertEquals(job3.toString(), String.format("\nID: %d\n" +
                        "Name: %s\n" +
                        "Employer: %s\n" +
                        "Location: %s\n" +
                        "Position Type: %s\n" +
                        "Core Competency: %s\n",
                job3.getId(),
                job3.getName(),
                job3.getEmployer(),
                job3.getLocation(),
                job3.getPositionType(),
                job3.getCoreCompetency()));
    }


    //If a field is empty, the method should add, “Data not available” after the label
    @Test
    public void testToStringCheckEmptyField () {
        job6 = new Job("SCRUM Master",
                new Employer(""),
                new Location("St. Louis"),
                new PositionType("Business Analyst"),
                new CoreCompetency("Communication"));
        assertEquals(job6.getEmployer().getValue(),("Data Not Available"));
    }

    @Test
    public void testToStringJobOnlyContainsDataForID () {
        job3.getName().equals("");
        job3.getEmployer().setValue("");
        job3.getLocation().setValue("");
        job3.getCoreCompetency().setValue("");
        job3.getPositionType().setValue("");
        assertTrue(job3.toString().contains("OOPS! This job does not seem to exist."));
    }

}

