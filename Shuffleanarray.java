import java.util.*;

public class Shuffleanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> list = Arrays.asList(arr);
        Collections.shuffle(list);

        for (int num : list) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}