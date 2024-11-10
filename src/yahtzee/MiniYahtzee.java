package yahtzee;

import java.util.Map;

class MiniYahtzee {

    private static final Map<String, Integer> NOMINATION_TO_TARGET = Map.of(
            "ones", 1,
            "twos", 2,
            "threes", 3
    );

    public static void main(String[] args) {
        int score = score(args[0], args[1], args[2], args[3]);
        System.out.println("Score: " + score);
    }

    public static int score(String nomination, String... dice) {
        Integer targetNumber = NOMINATION_TO_TARGET.get(nomination);

        if (targetNumber == null) {
            System.out.println("Invalid nomination: " + nomination);
            return 0; // Return 0 if the nomination is not recognized
        }

        // Parse dice values and pass to DiceCounter
        int[] diceValues = new int[dice.length];
        for (int i = 0; i < dice.length; i++) {
            diceValues[i] = Integer.parseInt(dice[i]);
        }

        DiceCounter counter = new DiceCounter(targetNumber);
        return counter.calculateScore(diceValues);
    }
}

class DiceCounter {
    private final int target;

    public DiceCounter(int target) {
        this.target = target;
    }

    public int calculateScore(int... dice) {
        // Use streams for a concise summation of matching dice values
        return (int) java.util.Arrays.stream(dice)
                .filter(d -> d == target)
                .count() * target;
    }
}
