import java.util.*;

public class JavaTest {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int a = 4;
        a <<= 1;
        a >>= 2;
        q.offer(a);
        System.out.println(">>>" + q.peek());

        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb.toString());

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(null);
        String str = list.toString();
        System.out.println(str);
    }
}
