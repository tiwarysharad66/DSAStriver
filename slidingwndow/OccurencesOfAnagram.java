package slidingwndow;

import java.util.HashMap;

public class OccurencesOfAnagram {
    public static void main(String[] args) {
String s = "forxxorfxdofr";
String ptr = "for";
        System.out.println(count(ptr,s));
    }
    public static int count(String ptr,String s){
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i = 0;i<ptr.length();i++){
            h.put(ptr.charAt(i),h.getOrDefault(ptr.charAt(i),0)+1);
        }
        int k = ptr.length();
        int i = 0;
        int j = 0;
        int size = s.length();
        int count = h.size();
        int ans = 0;
        while (j<size){
            if(h.containsKey(s.charAt(j))){
//                int c = h.get(s.charAt(j));
                h.put(s.charAt(j),h.get(s.charAt(j))-1);
                if(h.get(s.charAt(j))==0){
                    count--;
                }
            }

            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(count==0){
                    ans++;
                }
                if(h.containsKey(s.charAt(i))){
//                    int p = h.get(s.charAt(i));
                    h.put(s.charAt(i),h.get(s.charAt(i))+1);
                    if(h.get(s.charAt(i))==1){
                        count++;
                    }
                }
                i++;
                j++;
            }
        }
        return ans;

    }
}
