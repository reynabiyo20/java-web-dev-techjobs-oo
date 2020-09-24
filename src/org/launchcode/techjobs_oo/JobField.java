package org.launchcode.techjobs_oo;

public abstract class JobField {

    //declare each of the common fields.
    private int id;
    private static int nextId = 1;
    private String value;


    //Code the constructors

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    //create the appropriate getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    //Add in the custom methods

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobField jobField = (JobField) o;

        return id == jobField.getId();
    }

    @Override
    public String toString() {
        return value;
    }

    public int hashCode() {
        return super.hashCode();
    }











}
