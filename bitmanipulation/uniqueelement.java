package bitmanipulation;

public class uniqueelement {
    public static void main(String[] args) {
        int []elements = {2,3,4,2,6,4,3};

        System.out.println(answer(elements));
    }

    private static int answer(int[] elements) {
        int answer = 0;
       for(int element:elements){
           answer^=element;
       }
        return answer;
    }
}
