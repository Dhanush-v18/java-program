import java.util.*;
public class Main
{
	public static int decitooct(int n) {
		int ans=0;
		int rem=0;
		int x=1;
		while(n>0) {
			rem=n%8;
			ans=ans+rem*x;
			x=x*10;
			n=n/8;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int ans=decitooct(a);
		System.out.println(ans);
	}
}
