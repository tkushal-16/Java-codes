package basic.methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {1, 2 , 3, 4,};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num){
        //if you change the object through this reference variable, same object or original value of the object will change
        num[0] = 77;
    }
}
