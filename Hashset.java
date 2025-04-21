import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Hashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        System.out.println("Enter number of elements for Set 1:");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter " + n1 + " elements for Set 1:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextLine().trim());
        }
        System.out.println("Enter number of elements for Set 2:");
        int n2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter " + n2 + " elements for Set 2:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextLine().trim());
        }
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Common elements: " + intersection);
        Set<String> onlyInSet1 = new HashSet<>(set1);
        onlyInSet1.removeAll(set2);
        System.out.println("Only in Set 1: " + onlyInSet1);
        Set<String> onlyInSet2 = new HashSet<>(set2);
        onlyInSet2.removeAll(set1);
        System.out.println("Only in Set 2: " + onlyInSet2);
        System.out.println("Are both sets equal? " + set1.equals(set2));
        sc.close();
    }
}
