package edu.ntnu.idi.idatt;

public class Arrangement {
    private final int number;
    private final String name;
    private final String location;
    private final String organizer;
    private final String description;
    private final long time;

    public Arrangement(int number, String name, String location, String organizer, String description, long time) {
        this.number = number;
        this.name = name;
        this.location = location;
        this.organizer = organizer;
        this.description = description;
        this.time = time;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getOrganizer() {
        return organizer;
    }

    public String getDescription() {
        return description;
    }

    public long getTime() {
        return time;
    }


}

