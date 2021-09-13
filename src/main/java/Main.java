import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Focus on Today");
        Goals goals = new Goals();
        String goal = goals.saveGoal();
        System.out.println(goal);
    }
}
