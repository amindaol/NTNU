package edu.ntnu.idi.idatt;
import java.util.List;

public class Meny {
    private List<Rett> retter;

    public Meny(List<Rett> retter) {
        this.retter = retter;
    }

    public List<Rett> getRetter() {
        return retter;
    }

    public double getTotalPris() {
        double total = 0;
        for (Rett rett : retter) {
            total += rett.getPris();
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Rett rett : retter) {
            sb.append(rett.toString()).append("\n");
        }
        sb.append("Total pris: ").append(getTotalPris()).append(" NOK");
        return sb.toString();
    }

    public void add(Meny meny) {
    }
}
