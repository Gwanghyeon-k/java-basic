import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long nullStart = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            List<String> result = getNull();
            if (result != null) { // null 체크
                for (String item : result) {
                    // Do nothing
                }
            }
        }
        long nullEnd = System.nanoTime();
        System.out.println("Null check time: " + (nullEnd - nullStart) + " ns");

        long emptyStart = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            List<String> result = getEmpty();
            for (String item : result) {
                // Do nothing
            }
        }
        long emptyEnd = System.nanoTime();
        System.out.println("Empty collection time: " + (emptyEnd - emptyStart) + " ns");
    }

    public static List<String> getNull() {
        return null;
    }

    public static List<String> getEmpty() {
        return Collections.emptyList();
    }
}
