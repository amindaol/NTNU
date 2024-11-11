package edu.ntnu.idi.idatt;
import java.util.Arrays;
import java.util.Comparator;

public class ArrangementRegister {
    private Arrangement[] arrangements;
    private int arrangementCount = 0;

    //konstruktør, der jeg oppretter Arrangement som en liste
    public ArrangementRegister(int size) {
        arrangements = new Arrangement[size];
    }

    //metode for å registrere ett nytt arrangement
    public void registerNewArrangement(int number, String name, String location, String organizer, String description, long time) {
        arrangements[arrangementCount] = new Arrangement(number, name, location, organizer, description, time);
        arrangementCount++;
    }

    //metode for å finne alle arrangementer på ett gitt sted
    public String arrangementsAtThisPlace(String location) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrangementCount; i++) {
            if (arrangements[i].getLocation().equalsIgnoreCase(location)) {
                result.append(arrangements[i].getName())
                        .append(" (")
                        .append(arrangements[i].getTime())
                        .append(")\n");
            }
        }
        return result.toString();
    }

    //metode for å finne alle arrangementer på en gitt tid
    public String arrangementsAtThisTime(long time) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrangementCount; i++) {
            if (arrangements[i].getTime() == time) {
                result.append(arrangements[i].getName())
                        .append(" (")
                        .append(arrangements[i].getLocation())
                        .append(")\n");
            }
        }

        return result.toString();
    }

    //metode for å finne alle arrangementer i ett gitt tidsintervall
    public String arrangementsInTimeInterval(long startTime, long endTime) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrangementCount; i++) {
            long eventTime = arrangements[i].getTime();
            if (eventTime >= startTime && eventTime <= endTime) {
                result.append(arrangements[i].getName())
                        .append(" (")
                        .append(arrangements[i].getTime())
                        .append(", ")
                        .append(arrangements[i].getLocation())
                        .append(")\n");
            }
        }
        return result.toString();
    }

    //metode for å lage en sortert liste over alle registrerte arrangementer
    public String getSortedArrangements() {
        Arrangement[] sortedArrangements = Arrays.copyOf(arrangements, arrangementCount);
        Arrays.sort(sortedArrangements, Comparator.comparingLong(Arrangement::getTime));

        StringBuilder result = new StringBuilder();
        for (Arrangement arrangement : sortedArrangements) {
            result.append(arrangement.getName())
                    .append(" (")
                    .append(arrangement.getTime())
                    .append(", ")
                    .append(arrangement.getLocation())
                    .append(")\n");
        }
        return result.toString();
    }

}
