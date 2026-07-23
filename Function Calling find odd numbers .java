import java.util.*;
public class Main {
    public static void odd(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i%2!=0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        odd(1,21);
    }
}
