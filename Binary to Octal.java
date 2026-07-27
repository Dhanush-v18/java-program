import java.util.*;
public class Main
{
    public static int bintooct (int n){
        int ans=0;
        int rem=0;
        int x=1;
        while(n>0){
            rem =n%10;
            ans=ans+(rem*x);
            x=x*2;
            n=n/10;
        }
        return ans;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int ans=bintooct(a);
		System.out.println(ans);
	}
}
