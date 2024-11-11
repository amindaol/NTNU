package edu.ntnu.idi.idatt;
import java.util.ArrayList;
import java.util.List;

public class MenyRegister {
    private List<Rett> retter = new ArrayList<>();
    private List<Meny> meny = new ArrayList<>();

    public void registerRett(Rett rett) {
        retter.add(rett);
    }

    public Rett finnRettMedNavn(String navn) {
        for (Rett rett : retter) {
            if (rett.getNavn().equalsIgnoreCase(navn)) {
                return rett;
            }
        }
        return null;
    }

    public List<Rett> finnRetterAvType(String type) {
        List<Rett> result = new ArrayList<>();
        for (Rett rett : retter) {
            if (rett.getType().equalsIgnoreCase(type)) {
                result.add(rett);
            }
        }
        return result;
    }

    // Find all menus within a specified price range
    public List<Meny> finnMenyMedPrisIntervall(double minPris, double maxPris) {
        List<Meny> result = new ArrayList<>();
        for (Meny meny : meny) {
            double totalPris = meny.getTotalPris();
            if (totalPris >= minPris && totalPris <= maxPris) {
                result.add(meny);
            }
        }
        return result;
    }

    public void registrerRett(Rett rett) {
        retter.add(rett);
    }

    // Method to register a new menu
    public void registrerMeny(Meny meny) {
        meny.add(meny);
    }
}
