import java.util.* ;
import java.io.*;
import java.util.*;
class Solution {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        float r = sc.nextInt();

        int t = sc.nextInt();

        int ans = (int) ((p*r*t)*100);
        System.out.println(ans);

    }
}