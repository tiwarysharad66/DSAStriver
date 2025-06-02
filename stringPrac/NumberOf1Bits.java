package stringPrac;

public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(binary(1073741824));
        System.out.println(hammingWeight(1073741824));
    }
    public static int hammingWeight(int n) {
        String binary = binary(n);
        int count = 0;
        for(int i = 0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
    public static String binary(int n ){
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            sb.append(n%2);
            n = n/2;
        }
        sb = sb.reverse();
        return sb.toString();
    }
}
