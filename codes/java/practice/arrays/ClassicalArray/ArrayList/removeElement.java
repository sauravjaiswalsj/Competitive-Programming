import java.util.*;

public class removeElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.remove(5);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
