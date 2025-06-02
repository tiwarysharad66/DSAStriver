//package stringPrac;
//
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class RomanToIntegers {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
//        System.out.println(romanToInt(str));
//    }
//    public static int romanToInt(String s) {
//        HashMap<Character,Integer> h = new HashMap<>();
//        h.put('I',1);
//        h.put('V',5);
//        h.put('X',10);
//        h.put('L',50);
//        h.put('C',100);
//        h.put('D',500);
//        h.put('M',1000);
//        int ans =0;
//        int curr = 0;
//        for(int i =s.length()-1;i>=0;i-=2){
//            if(i==0){
//                curr = h.get(s.charAt(i));
//                ans+=curr;
//                return ans;
//            }
//               if(h.get(s.charAt(i))>h.get(s.charAt(i-1))){
//                   curr= h.get(s.charAt(i))-h.get(s.charAt(i-1));
//                   ans+=curr;
//               }
//               else{
//                   curr =h.get(s.charAt(i))+h.get(s.charAt(i-1));
//            ans+=curr;
//
//        }
//        return ans;
//    }
//}
