import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ZigZag {
    LinkedList<Iterator> list;

    public ZigZag(List<Integer> list1, List<Integer> list2) {
        this.list = new LinkedList<>();
        if(!list1.isEmpty()) list.add(list1.iterator());
        if(!list2.isEmpty()) list.add(list2.iterator());
    }

    public int next(){
        Iterator poll = list.poll();
        int next = (Integer) poll.next();
        if(poll.hasNext()) list.add(poll);
        return next;
    }

    public boolean hasNext(){
        return !list.isEmpty();
    }
}
