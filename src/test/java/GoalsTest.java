import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Goals")
public class GoalsTest {
    @Test
    @DisplayName("returns a goal")
    void testGoalsSavesAGoalIntoGoalsList() {
        Goals goal = new Goals();
        String myGoal = goal.saveGoal();
        assertEquals("My first goal", myGoal);
    }
}
