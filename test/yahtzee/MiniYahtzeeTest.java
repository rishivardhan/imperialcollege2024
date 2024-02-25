package yahtzee;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MiniYahtzeeTest {

    @Test
    public void allOnesAsOnes() {
        int result = MiniYahtzee.score("ones", "1", "1", "1");
        assertThat(result, is(3));
    }

    @Test
    public void twoOnesAsOnes() {
        int result = MiniYahtzee.score("ones", "3", "1", "1");
        assertThat(result, is(2));
    }

    @Test
    public void oneOneAsOnes() {
        int result = MiniYahtzee.score("ones", "3", "2", "1");
        assertThat(result, is(1));
    }

    @Test
    public void noOnesAsOnes() {
        int result = MiniYahtzee.score("ones", "3", "2", "2");
        assertThat(result, is(0));
    }

    @Test
    public void allTwosAsTwos() {
        int result = MiniYahtzee.score("twos", "2", "2", "2");
        assertThat(result, is(6));
    }

    @Test
    public void twoTwosAsTwos() {
        int result = MiniYahtzee.score("twos", "2", "3", "2");
        assertThat(result, is(4));
    }

    @Test
    public void oneTwoAsTwos() {
        int result = MiniYahtzee.score("twos", "3", "2", "1");
        assertThat(result, is(2));
    }

    @Test
    public void noTwosAsTwos() {
        int result = MiniYahtzee.score("twos", "3", "1", "1");
        assertThat(result, is(0));
    }

    @Test
    public void allThreesAsThrees() {
        int result = MiniYahtzee.score("threes", "3", "3", "3");
        assertThat(result, is(9));
    }

    @Test
    public void twoThreesAsThrees() {
        int result = MiniYahtzee.score("threes", "3", "3", "2");
        assertThat(result, is(6));
    }

    @Test
    public void oneThreeAsThrees() {
        int result = MiniYahtzee.score("threes", "1", "2", "3");
        assertThat(result, is(3));
    }

    @Test
    public void noThreesAsThrees() {
        int result = MiniYahtzee.score("threes", "2", "2", "2");
        assertThat(result, is(0));
    }
}