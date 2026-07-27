import java.util.*;
public class Main{
    public static int sumofdigit(int a){
        int sum=0;
        int r=0;
        while(a>0){
        r=a%10;
        sum=sum+r;
        a=a/10;
    }
    return sum;
}
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ans=sumofdigit(a);
        if(ans>10){
            System.out.println(ans);
        }
        else{
            System.out.println("enter a valid one");
        }
    }
}
