package yahtzee;

class MiniYahtzee {

    public static void main(String[] args) {
        score(args[0], args[1], args[2], args[3]);
    }

    public static int score(String nomination, String d1, String d2, String d3) {
        int score = 0;
        int first = Integer.parseInt(d1);

        if (nomination.equals("ones")) {
            score = new Max().ones(first, Integer.parseInt(d2), Integer.parseInt(d3));
        }
        if (nomination.equals("twos")) {
            score = new Max().twos(first, Integer.parseInt(d2), Integer.parseInt(d3));
        }
        if (nomination.equals("threes")) {
            score = new Max().threes(first, Integer.parseInt(d2), Integer.parseInt(d3));
        }

        return score;
    }
}

class Ones {
    int ones(int d1, int d2, int d3) {
        int sum = 0;
        if (d1 == 1) sum++;
        if (d2 == 1) sum++;
        if (d3 == 1) sum++;
        return sum;
    }
}

class Twos extends Ones {
    int twos(int d1, int d2, int d3) {
        int sum = 0;
        if (d1 == 2) sum += 2;
        if (d2 == 2) sum += 2;
        if (d3 == 2) sum += 2;
        return sum;
    }
}

class Max extends Twos {
    int threes(int d1, int d2, int d3) {
        int s;
        s = 0;
        if (d1 == 3) s += 3;
        if (d2 == 3) s += 3;
        if (d3 == 3) s += 3;
        return s;
    }
}