package algorithms.queue;

public class Tuple {
    int x, y;

    public Tuple(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Tuple income = (Tuple) obj;
        return (this.x == income.x && this.y == income.y);
    }

}
