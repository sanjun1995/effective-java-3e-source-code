package effectivejava.chapter7.item43;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Frequency table implemented with map.merge, using lambda and method reference (Page 197)
public class Freq {
    public static void main(String[] args) {
        Map<String, Integer> frequencyTable = new TreeMap<>();

        List<String> arg = List.of("1", "2", "3", "2", "3", "3");

        for (String s : arg)
            frequencyTable.merge(s, 1, (count, incr) -> count + incr); // Lambda
        System.out.println(frequencyTable);

        frequencyTable.clear();
        for (String s : arg)
            frequencyTable.merge(s, 1, Integer::sum); // Method reference
        System.out.println(frequencyTable);

    }
}
