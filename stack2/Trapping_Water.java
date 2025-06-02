package stack2;

public class Trapping_Water {
    public static void main(String[] args) {
int height [] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
    public static int trap(int[] height) {
int size = height.length;
int prefix[] = new int[size];
int suffix[] = new int[size];
prefix[0] = height[0];
for(int i = 1;i<size;i++){
    prefix[i] = Math.max(prefix[i-1],height[i]);
}
suffix[size-1] = height[size-1];
for(int j = size-2;j>=0;j--){
    suffix[j] = Math.max(suffix[j+1],height[j]);
}
int sum = 0;
for(int i=0;i<size;i++){
    if(height[i]<prefix[i]&&height[i]<suffix[i]){
        sum+=Math.min(prefix[i],suffix[i])-height[i];
    }
}
return sum;
    }
}
