import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int hrs = min/60;
        min = min%60;
        if (hrs<12) {
            System.out.println(hrs+":"+min+"AM");
        }
        else {
            System.out.println(hrs+":"+min+"PM");
        }
    }
}
