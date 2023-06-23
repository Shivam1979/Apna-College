public class Array_15 {
 // que:- 4 Given n non -negative integers representing an elevation map the width
//Trap water
     public static int trap(int [] height){
         int n = height.length;
         int res = 0,l=0,r=n-1;
         int rMax = height[r],lmax = height[l];
         while (l<r){
             if (lmax <rMax){
                 l++;
                 lmax = Math.max(lmax , height[l]);
                 res += lmax - height[l];
             }else {
                 r--;
                 rMax = Math.max(rMax,height[r]);
                 res +=rMax - height[r];
             }
         }
         return res;
     }

    public static void main(String[] args) {
     int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
          int ans =  trap(height);
        System.out.println(ans);
    }
}
