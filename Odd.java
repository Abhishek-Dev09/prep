import java.util.NoSuchElementException;

public class Odd {
    private final int[] numbers;
    private int currentIndex;

    public Odd(int[] numbers) {
        this.numbers = numbers;
        this.currentIndex = 0;
    }

    public boolean hasNext() {
        while (currentIndex < numbers.length && currentIndex%2 == 0) {
            currentIndex++;
        }
        return currentIndex < numbers.length;
    }
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        while (currentIndex < numbers.length && currentIndex % 2 == 0) {
            currentIndex++;
        }
        return numbers[currentIndex++];
    }
}
