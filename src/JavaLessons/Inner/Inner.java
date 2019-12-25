package Inner;

import java.util.Arrays;
import java.util.Comparator;

public class Inner {
    public static void main(String[] args) {
        DemoInner demo1 = new DemoInner();
        DemoInner demo = new DemoInner() {
            public void demo() {
                super.demo();
                System.out.println("yeah this is anonimus demo inner");
            }
        };
        demo1.demo();
        demo.demo();

        AnonimusInterface impl = new AnonimusInterface() {

            @Override
            public void print(String message) {

            }
        };

        Arrays.asList(1,2,5,7,346,346,346,34).sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
    }
}
