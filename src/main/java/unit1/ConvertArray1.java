package unit1;

/**
* 该算法时间复杂度为n，空间复杂度为1.局限于Java数组操作没有reverse操作，故自己实现了一个类似的
**/
public class ConvertArray1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int target = 2; //定义要翻转的位置，从0开始计数

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * i;
        }

        ConvertArray1 convertArray1 = new ConvertArray1();
        convertArray1.reverse(arr, 0, target);
        convertArray1.reverse(arr, target + 1, 4);//定义位置的后一位
        convertArray1.reverse(arr, 0, 4);

        for (int index  = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
    }

    private void reverse(int[] array, int start, int end) {//在start和end之间将数组翻转
        if (end > array.length || start < 0 || start > end) {
            System.out.println("Error! 超出数组长度");
        }

        int temp;
        while (start < end) {//此处的思想类似于双指针
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
