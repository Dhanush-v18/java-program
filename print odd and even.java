import java.util.*;
public class Main
{
	public static void odd(int n){
	    for(int i=1;i<=n;i++){
	        if(i%2==1){
	            System.out.println(i+" odd");
	        }
	    }
	}
	public static void even(int n){
	    for(int i=1;i<=n;i++){
	        if(i%2==0){
	            System.out.println(i+" even");
	        }
	    }
	}
	public static void main(String [] args){
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    odd(a);
	    even(a);
	}
}
