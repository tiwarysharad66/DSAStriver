package Recursion.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int arr[] = {3, 18, 1, 18, 9};
//        System.out.println(linearsearch(arr, 18, 0));
//        System.out.println(linearsearchlast(arr, 18, arr.length - 1));
//        linearsearch(arr, 18, 0);
//        System.out.println(list);
        ArrayList<Integer> ans = new ArrayList<>();
//        arrayList<Integer> list = findallindex(arr,18,0,new arrayList<>());
        ArrayList<Integer> list = findallindex(arr,18,0,ans);
//        System.out.println(list);
        System.out.println(ans);
    }

    static void linearsearch(int[] arr, int key, int index) {
        if (index == arr.length) {
            return;
//            return -1;
        } else if (arr[index] == key) {
            list.add(index);
        }

        linearsearch(arr, key, index + 1);


//        return arr[index]==key || linearsearch(arr,key,index+1);

    }

    //    static boolean linearsearchlast(int []arr,int key ,int index){
//        if(index==-1){
//            return false;
////            return -1;
//        }
////        else if(arr[index]==key){
////            return index;
////        }
////        else{
////          return  linearsearch(arr,key,index+1);
////        }
//        return arr[index]==key || linearsearch(arr,key,index-1);
//    }
    static ArrayList findallindex(int arr[], int key, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == key) {
            list.add(index);
        }
        return findallindex(arr, key, index + 1,list);
    }
    static ArrayList findallindex2(int arr[], int key, int index) {
        ArrayList<Integer>list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        //this will contain ans for that func call only
        //a
        if (arr[index] == key) {
            list.add(index);
        }
        ArrayList<Integer> listans  = findallindex(arr, key, index + 1,list);
        list.addAll(listans);
        return list;
    }

}
