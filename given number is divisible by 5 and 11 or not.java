import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean val = (n % 5 == 0 && n % 11 == 0);
        if (val) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
