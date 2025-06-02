public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(ArmstrongNumber(371));
    }
    public static boolean ArmstrongNumber(int number) {
        int r = number;
        int cubic = 0;
        while(number!=0){
            int cube = (number%10)*(number%10)*(number%10);
            cubic+=cube;
            number = number/10;
        }
        if(cubic==r){
            return true;
        }
        return false;
    }
}
