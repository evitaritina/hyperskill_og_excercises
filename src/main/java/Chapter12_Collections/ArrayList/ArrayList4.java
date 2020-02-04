package Chapter12_Collections.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
/**
 * ArrayList → Concat positive numbers
 * Implement a method to concatenate all positive numbers of two input ArrayList's to a single result list.
 *
 * The first part of the result list must be filled with elements from the first ArrayList,
 * and the second part with elements from the second ArrayList.
 *
 * Sample Input 1:
 * 8 11 -2 -3 14 15
 * -1 33 12 -3 -5
 *
 * Sample Output 1:
 * 8 11 14 15 33 12
 */
public class ArrayList4 {
    public static ArrayList<Integer> concatPositiveNumbers(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        for (int el : l2) {

            l1.add(el);
        }
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i) < 0){
                l1.remove(i);
                i--;
            }
        }

        return l1; // write your code here

    }

    /* Do not modify this method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = readArrayList(scanner);
        ArrayList<Integer> list2 = readArrayList(scanner);

        ArrayList<Integer> result = concatPositiveNumbers(list1, list2);

        result.forEach((n) -> System.out.print(n + " "));
    }

    /* Do not modify this method */
    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}