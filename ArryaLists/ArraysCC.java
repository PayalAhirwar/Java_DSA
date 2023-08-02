import java.util.*;

public class ArraysCC {
  public static int trappedWater(int height[]) {
  int n = height.length;
        //calculate leftmax boundry array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i = 0; i<n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        //calculate rightmax boundry array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i= n-2; i>=0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        int trappedWater = 0;
        //loop 
        for(int i=0; i<n; i++) {
            //Water level = min(leftmax boundry, rightmax boundry)
            int WaterLevel = Math.min(leftmax[i], rightmax[i]);
            trappedWater += WaterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]) {
        int height[] = { 4,2,0,6,3,2,5};
        System.out.print(trappedWater(height));
    }
}

       