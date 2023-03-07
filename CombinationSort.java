import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class CombinationSort {

    public static void main(String[] args) {

        List<String> stringList= Arrays.asList("d34", "g54", "d12", "b87", "g1", "c65", "g40", "g5", "d77");
        combinationSort(stringList);
    }

    private static void combinationSort(List<String> stringList) {

        //sorting with first letter
        List<String> firstList = stringList
                .stream()
                .sorted(Comparator.comparing(s -> s.substring(0, 1)))
                .collect(Collectors.toList());

        System.out.println(firstList);


        //sorting only with numbers in reverse order
        List<String> collect= firstList
                .stream()
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.substring(1))))
                .collect(Collectors.toList());
        Collections.reverse(collect);
        //sorting with first letter
        List<String> secondList = collect
                .stream()
                .sorted(Comparator.comparing(s -> s.substring(0, 1)))
                .collect(Collectors.toList());
        System.out.println(secondList);


    }
}
