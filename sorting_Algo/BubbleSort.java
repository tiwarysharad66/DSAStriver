package sorting_Algo;

public class BubbleSort {
    public static void main(String[] args) {
int[]arr = {1,3,5,4,2};
Implementbubble(arr);
PrintArray(arr);
    }

    public static void Implementbubble(int[]arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -1- i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
public static void PrintArray(int[]arr){
    for(int x:arr){
        System.out.println(x);
    }
        }
    }

