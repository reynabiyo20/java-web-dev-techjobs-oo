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

        return id;
    }


    @Override
    public String toString() {
        String text1 = "Data not available";

        if (name.trim().equals("")) {
            name = text1;
        }

        if (employer.getValue().trim().equals("")) {
            employer.setValue(text1);
        }

        if (location.getValue().trim().equals("")) {
            location.setValue(text1);
        }

        if (coreCompetency.getValue().trim().equals("")) {
            coreCompetency.setValue(text1);
        }

        if (positionType.getValue().trim().equals("")) {
            positionType.setValue(text1);

            return "\nID: " + id + "\n" +
                    "Name: " + name + "\n" +
                    "Employer: " + employer + "\n" +
                    "Location: " + location + "\n" +
                    "Position Type: " + positionType + "\n" +
                    "Core Competency: " + coreCompetency + "\n";
        } else {

            if (employer.getValue().equals(text1)
                    || location.getValue().equals(text1)
                    || coreCompetency.getValue().equals(text1)
                    || positionType.getValue().equals(text1)) {
            }
            return "OOPS! This job does not seem to exist.";
        }
    }


        // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
        //  and id.

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

        public int getId () {
            return id;
        }
    }
