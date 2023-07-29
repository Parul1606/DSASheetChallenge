package DSASheetChallenge.Day3;

import java.util.Arrays;
import java.util.Collections;

public class Permute {
    public static boolean isPermute(Integer a[], int b[], int n, int k){
        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b);
        for(int i=0; i<n;i++){
            if(a[i]+b[i]<k) return false;
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Integer a[] = {2,1,3};
        int b[] = {7,9,8};
        int k = 10;
        int n = a.length;

        if(isPermute(a, b, n, k)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
}
