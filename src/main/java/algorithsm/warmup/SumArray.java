package algorithsm.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class SumArray {
    static int simpleArraySum(int[] ar) {
        return Arrays.stream(ar).sum();
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int APoint = 0;
        int BPoint = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) APoint += 1;
            else if (a.get(i).equals(b.get(i))) continue;
            else BPoint += 1;
        }
        return Stream.of(APoint, BPoint).collect(toList());
    }

    static long aVeryBigSum(long[] ar) {
        return Arrays.stream(ar).sum();
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int rightDiagonal = 0;
        int leftDiagonal = 0;
        for (int i = 0; i < arr.size(); i++) {
            leftDiagonal += arr.get(i).get(i);
            rightDiagonal += arr.get(arr.size() - 1 - i).get(i);
        }
        return Math.abs(leftDiagonal - rightDiagonal);
    }

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        for (int ele : arr) {
            if (ele > 0) posCount++;
            else if (ele < 0) negCount++;
            else zeroCount++;
        }
        System.out.printf("%.6f\n%.6f\n%.6f%n",
                (float) posCount / arr.length,
                (float) negCount / arr.length,
                (float) zeroCount / arr.length);
    }

    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            StringBuilder txt = new StringBuilder();
            for (int j = 0; j < n - i; j++) {
                txt.append(" ");
            }
            for (int j = 0; j < i; j++) {
                txt.append("#");
            }
            System.out.println(txt);
        }
    }

    public static void miniMaxSum(int[] arr) {
        List<Integer> minArr = new ArrayList<>();
        List<Integer> maxArr = new ArrayList<>();
        List<Integer> minWholeTempArr = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i = 0; i < 4; i++) {
            int minEle = minWholeTempArr.stream().mapToInt(ele -> ele).min().getAsInt();
            minArr.add(minEle);
            minWholeTempArr.remove(minWholeTempArr.indexOf(minEle));
        }
        List<Integer> maxWholeTempArr = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i = 0; i < 4; i++) {
            int maxEle = maxWholeTempArr.stream().mapToInt(ele -> ele).max().getAsInt();
            maxArr.add(maxEle);
            maxWholeTempArr.remove(maxWholeTempArr.indexOf(maxEle));
        }
        long min = minArr.stream().mapToLong(ele -> ele).sum();
        long max = maxArr.stream().mapToLong(ele -> ele).sum();
        System.out.printf("%d %d", min, max);
    }
}
