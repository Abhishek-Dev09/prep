import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(6);
        l1.add(99);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        ZigZag z = new ZigZag(l1, l2);
//        while(z.hasNext())
//            System.out.println(z.next());
//
//        Step iterator = new Step(0, 10, 2);
//        while (iterator.hasNext()) {
//            int value = iterator.next();
//            System.out.println(value);
//        }
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        Odd iterator = new Odd(numbers);
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        String[] list = {"a", "b", "c"};
//        Iterator<String> iterator = new Cyclic<>(list);
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print(iterator.next() + " ");
//        }

        FileSystem obj = new FileSystem();
        List<String> param_1 = obj.ls("/");
        obj.mkdir("/a/b/c");
        obj.addContentToFile("/a/b/c/d","hello");
        List<String> param_2 = obj.ls("/");
        String param_4 = obj.readContentFromFile("/a/b/c/d");
    }
}
