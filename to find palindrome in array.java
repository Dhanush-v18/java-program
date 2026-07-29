import java.util.Scanner;
public class Main{
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        palindrome(arr,size);
    }
    public static void palindrome(int [] arr,int size){
        int l=0;
        int r=size-1;
        while(l<r){
        if(arr[l]!=arr[r]){
            System.out.println("No");
            return;
        }
        l++;
        r--;
        }
    
        System.out.print("Yes");
        
        }
    }
