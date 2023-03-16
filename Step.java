public class Step {
    private int current;
    private final int end;
    private final int step;

    Step(int start, int end, int step){
        this.current = start;
        this.end = end;
        this.step = step;
    }

    public boolean hasNext() {
        return current < end;
    }

    public Integer next() {
        int result = current;
        current += step;
        return result;
    }
}
