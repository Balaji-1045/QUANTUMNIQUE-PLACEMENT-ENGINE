BLOCK 4 – PROBLEM SOLVING

Find the missing number in the array

[1,2,3,4,6,7,8]

Expected Output
5

Hint

Use the formula:

Sum = n*(n+1)/2


Answer

import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int res,sum=0;
        int arr[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
            sum += arr[i];
        }
        res= n*(n+1)/2;
        int ans = res-sum;
        System.out.print(ans);
    }
}