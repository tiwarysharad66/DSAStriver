package practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;


     class LongestConsectiveSequence {
        public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            int size = s.nextInt();
            int [] arr = new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = s.nextInt();
            }
            System.out.println(lcs(arr));
        }
        public static int[] duplicatesremove(int arr[]){
            TreeSet<Integer> set = new TreeSet<>();
            for(int num:arr){
                set.add(num);
            }
            int i = 0;
            int newarr[] = new int[set.size()];
            for(int num:set){
                newarr[i++] = num;
            }
            return newarr;
        }
        public static int lcs(int arr[]){
            int size = arr.length;
            Arrays.sort(arr);
            int arrnew[] = duplicatesremove(arr);
            int count = 1;
            int m = Integer.MIN_VALUE;
            for(int i = 0;i<arrnew.length-1;i++){
                if(arrnew[i]+1==arrnew[i+1]){
                    count++;
                    m = Math.max(count,m);
                }
                else{
                    count = 1;
                }
            }
            return m;
        }
    }

