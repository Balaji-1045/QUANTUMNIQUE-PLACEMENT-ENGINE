package Day_04;

import java.util.*;

public class Duplicates_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> dup = new HashSet<>();
        for(int num : arr){
            if(set.contains(num)){
                dup.add(num);
            } 
            else {
                set.add(num);
            }
        }
        System.out.println(dup);
    }
}

    

