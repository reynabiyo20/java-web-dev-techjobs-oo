package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {
    public int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation,
               PositionType aPositionType, CoreCompetency aCoreCompetency) {

        this();

        name = aName;
        employer = aEmployer;
        location = aLocation;
        positionType = aPositionType;
        coreCompetency = aCoreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Job job = (Job) o;

        return id == job.id;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        String[] jobInformation = {this.name, this.employer.getValue(),
                this.location.getValue(), this.positionType.getValue(),
                this.coreCompetency.getValue()};
        int counter = 0;

        for (int i = 0; i < jobInformation.length; i++) {
            if (jobInformation[i].equals("")) {
                jobInformation[i] = "Data not available";
                counter++;
            }
        }
        if (counter == 0 ) {
            return "\nID: " + id + "\n" +
                    "Name: " + jobInformation[0] + "\n" +
                    "Employer: " + jobInformation[1] + "\n" +
                    "Location: " + jobInformation[2] + "\n" +
                    "Position Type: " + jobInformation[3] + "\n" +
                    "Core Competency: " + jobInformation[4] + "\n";

        } else {
            return "OOPS! This job does not seem to exist.";
        }
    }



    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
        //  and id.

    public int getId () {
        return id;
    }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public Employer getEmployer () {
            return employer;
        }

        public void setEmployer (Employer employer){
            this.employer = employer;
        }

        public Location getLocation () {
            return location;
        }

        public void setLocation (Location location){
            this.location = location;
        }

        public PositionType getPositionType () {
            return positionType;
        }

        public void setPositionType (PositionType positionType){
            this.positionType = positionType;
        }

        public CoreCompetency getCoreCompetency () {
            return coreCompetency;
        }

        public void setCoreCompetency (CoreCompetency coreCompetency){
            this.coreCompetency = coreCompetency;
        }


}
