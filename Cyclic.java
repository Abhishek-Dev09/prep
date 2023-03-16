import java.util.Iterator;

public class Cyclic<E> implements Iterator<E> {
    private final E[] elements;
    private int index;

    public Cyclic(E[] elements) {
        this.elements = elements;
        this.index = 0;
    }

    public boolean hasNext() {
        return elements.length!=0;
    }

    public E next() {
        E nextElement = elements[index];
        index = (index + 1) % elements.length;
        return nextElement;
    }
}
