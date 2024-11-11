import java.util.Random;

public class Player {

    private int sumPoints;
    private Random dice;

    public Player() {
        this.sumPoints = 0;
        this.dice = new Random();
    }

    public int getSumPoints() {
        return sumPoints;
    }

    public int throwDice() {
        int dicethrow = dice.nextInt(6) + 1;
        return dicethrow;
    }

    public void addPoints(int points) {
        sumPoints += points;

        if (points == 1) {
            sumPoints = 0;
        }

        if (sumPoints > 100) {
            sumPoints -= points;
        }
    }
    
    public boolean isDone() {
        return sumPoints == 100;
    }

    public static void main(String[] args) throws Exception {
        Player A = new Player();
        Player B = new Player();
        boolean gameOver = false;

        System.out.println("Spillet starter. . .");

        while (!gameOver) {
        int rollA = A.throwDice();
        A.addPoints(rollA);
        System.out.println("Spiller A fikk" + " " + rollA + ", total poengsum = " + A.getSumPoints());

        if (A.isDone()) {
            System.out.println("Spiller A vant! ");
            gameOver = true;
            break;
        }

        int rollB = B.throwDice();
        B.addPoints(rollB);
        System.out.println("Spiller B fikk" + " " + rollB + ", total poengsum = " + B.getSumPoints());

        if(B.isDone()) {
            System.out.println("Spiller B vant! ");
            gameOver = true;
            break;
        }

        }
    }

}
