// Count all possible paths from top left to bottom right of a mXn matrix

// The problem is to count all the possible paths from top left to bottom 
//right of a mXn matrix with the constraints that from each cell you can 
//either move only to right or down
package Recursion;
import java.util.*;
public class Find_all_path_in_nxm_grid {
    public static int path(int m,int n){
        if(n==1 || m==1)
        return 1;
        return path(m-1,n)+path(m,n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.print(path(m,n));
    }
}
