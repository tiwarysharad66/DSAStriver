package Arrays;

public class trappingrainwater {
    public static void main(String[] args) {
        int arrheight[] =  {4,2,0,3,2,5};

        System.out.println("the total trapwater in the buildings is " + trapwatersum(arrheight));

    }
    public static int trapwatersum(int height[]){
    int n = height.length;
    int leftmax[] = new int[n];
    int rightmax[] = new int[n];
    leftmax[0] = height[0];
    int waterlevel = 0;
    int trapwater = 0;
    int width = 1;
    for(int i=1;i<n;i++){
        leftmax[i] = Math.max(height[i],leftmax[i-1]);
    }
    rightmax[n-1] = height[n-1];
    for(int i=n-2;i>=0;i--){
        rightmax[i] = Math.max(height[i],leftmax[i+1]);
    }
    for(int i=0;i<n;i++){
        waterlevel = Math.min(leftmax[i],rightmax[i]);
        trapwater+= waterlevel-height[i]*width;
    }
    return trapwater;
}


    }