package lab13;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Question3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Enter the values");
        while (true) {
            int key = sc.nextInt();
            if (key == 0)
                break;
            if (map.containsKey(key)) {
                int value = map.get(key);
                value++;
                map.put(key, value);
            } else
                map.put(key, 1);
        }
        int max = Collections.max(map.values());
        HashSet<Integer> set = new HashSet<>();
        set.addAll(map.keySet());
        System.out.println("The elements that occurred the maximum times are :");
        for (Integer i : set) {
            if (map.get(i) == max)
                System.out.print(i + " ");
        }
        sc.close();
    }
}
