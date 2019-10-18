package unit6;

public class BinarySearch {
    public static void main(String[] args) {
        Double[] arr = new Double[10];
        for (int index = 0; index < 10; index++) {
            arr[index] = index * 3.5;
        }

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(arr, 3.5));
    }

    public <T extends Number> int search(T[] arr, T key) {//注：此处通配符T限定为Number的子类，所以T限定为对象数组，不能为基本类型的数组
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (arr[mid].doubleValue() == key.doubleValue()) {
                return mid;
            } else if (arr[mid].doubleValue() < key.doubleValue()) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            mid = (start + end) / 2;
        }

        return -1;
    }
}
