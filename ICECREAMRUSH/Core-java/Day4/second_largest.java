import java.util.Arrays;

public class second_largest {
    public static void main(String[] args) {
        int[] arr = {233,4,-32,89,6,33,66};
        Arrays.sort(arr);
        System.out.println("second largest element is "+ arr[arr.length-2]);


    }
}
