import java.util.*;
public class Main{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int m = sc.nextInt();
        if(m>=90 && m<=100){
            System.out.println("Grade O");
        }
        else if(m<=80 && m>=70){
            System.out.println("Grade A+");
        }
        else if(m<=70 && m>=60){
            System.out.println("Grade A");
        }
        else if(m<=60 && m>=50){
            System.out.println("Grade B+");
        }
        else if(m>=50 && m>=40){
            System.out.println("Grade C");
        }
        else {
            System.out.print("Better Luck Next Time");
        }
    }
}
