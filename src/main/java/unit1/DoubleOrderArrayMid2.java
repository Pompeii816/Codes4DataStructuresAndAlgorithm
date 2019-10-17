package unit1;

public class DoubleOrderArrayMid2 {
    public static void main(String[] args) {

    }

    private static int findMid(int[] arr1, int[] arr2) {
        int result = 0;

        int start1 = 0;
        int end1 = arr1.length - 1;
        int start2 = 0;
        int end2 = arr2.length - 1;

        while (!(end1 - start1 == 0 && end2 - start2 == 0)) {
            int mid1 = (start1 + end1) / 2;
            int mid2 = (start2 + end2) / 2;

            if (arr1[mid1] == arr2[mid2]) {
                result = arr1[mid1];
                break;
            } else if (arr1[mid1] > arr2[mid2]) {
                //undo: 未检查去掉的部分长度是不是一致
                end1 = mid1 - 1;
                start2 = mid2 + 1;
            } else {
                //undo: 未检查去掉的部分长度是不是一致
                start1 = mid1 + 1;
                end2 = mid2 - 1;
            }
        }

        if (end1 - start1 == 0 && end2 - start2 == 0) {
            result = Math.min(arr1[start1], arr2[start2]);
        }

        return result;
    }
}
