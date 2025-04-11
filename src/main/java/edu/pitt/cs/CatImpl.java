package edu.pitt.cs;

public class CatImpl implements Cat {

    // TODO: Fill in with member variables
    private int id;
    private String name;
    private boolean rented;



    public CatImpl(int id, String name) {
        this.id = id;
        this.name = name;
        this.rented = false;
    }

    public void rentCat() {
        rented = true;
    }

    public void returnCat() {
        rented = false;
    }

    public void renameCat(String name) {
        this.name = name;
    }

    public String getName() {
        // TODO: Fill in
        return name;
    }

    public int getId() {
        // TODO: Fill in
        return id;
    }

    public boolean getRented() {
        // TODO: Fill in
        return rented;
    }

    public String toString() {
        // TODO: Fill in
        return "ID "+ id+ ". "+name;
    }

}