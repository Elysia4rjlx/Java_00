import java.util.Arrays;

public class programProblem {
    public static void transform(int[] array) {
//实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
//并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static void main1(String[] args) {
        int[] array1 = {1, 2, 3};
        transform(array1);
        System.out.println(Arrays.toString(array1));
    }

    public static void adjust(int[] array) {
// 调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
// 如数组：[1,2,3,4,5,6]
// 调整后可能是：[1, 5, 3, 4, 2, 6]
        int left = 0;           // 左指针从数组起始位置开始
        int right = array.length - 1;  // 右指针从数组末尾开始
        while (left < right) {
            while (left < right && array[left] % 2 != 0) {
                left++;
            }
            while (left < right && array[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
    }

    public static void main2(String[] args) {
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        adjust(array2);
        System.out.println(Arrays.toString(array2));
    }


    public static int binarySearch(int[] array, int key) {
//    给定一个有序整型数组, 实现二分查找
        int left = 0;           // 左指针从数组起始位置开始
        int right = array.length - 1;  // 右指针从数组末尾开始

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main3(String[] args) {
        int[] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 50;
        System.out.println(binarySearch(array3, key));
    }


    public static void bubbleSort(int[] array) {
//        给定一个整型数组, 实现冒泡排序(升序排序)
        if (array == null || array.length <= 1) {
            return; // 数组为空或长度为1时直接返回
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                //为什么是 array.length - 1 - i？
                //每一轮结束后，最大的元素已经在末尾，因此下一轮可以少比较一个元素。i 表示已经排好序的元素个数。
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }

    public static void bubbleSort1(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean flg = false;
            //- i 就是一种优化  每一趟比上一趟上比较1次
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    flg = true;
                }
            }
            if (flg == false) {
                break;
            }
        }
    }

    public static void main4(String[] args) {

        int[] array4 = {2, 5, 3, 9, 6, 4};
        System.out.println("排序前：" + Arrays.toString(array4));
        bubbleSort(array4);
        System.out.println("排序后：" + Arrays.toString(array4));
    }


    public static int[] findSumOfTwo(int[] array, int target) {
//        给定一个整数数组 nums 和一个整数目标值 target，
//        请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
//        你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//        你可以按任意顺序返回答案。
//        示例 1：
//        输入：nums = [2,7,11,15], target = 9
//        输出：[0,1]
//        解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

        int[] result = {-1, -1};
        // （-1，-1）表示为未找到，因为下标非负
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result; // 找到后立即返回，提高效率
                }
            }
        }
        return result;
    }

    public static void main5(String[] args) {

        int[] array5 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(findSumOfTwo(array5, 9)));
    }

    public static boolean fun(int[] array) {
        //给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：
        // 如果存在，请返回 true ；否则，返回 false

        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }

        }
        return false;
    }

    public static void main6(String[] args) {

        int[] array6 = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        System.out.println(fun(array6));
    }


    public static int uniqueNumber(int[] array) {
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret ^= array[i];
        }
        return ret;

    }

    public static void main7(String[] args) {

        int[] array7 = {4, 1, 2, 1, 2};
        System.out.println(uniqueNumber(array7));
    }

    public static int getUnique(int[] array) {
        //给定一个非空整数数组，除了某个元素只出现一次以外，
        // 其余每个元素均出现两次。找出那个只出现了一次的元素。
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]){
                    count++;
                }
            }
            if (count==1){
                return array[i];
            }
        }
        return -1;
    }

    public static void main8(String[] args) {
        int[] array8 = {1, 2, 1, 2,4};
        System.out.println(getUnique(array8));
    }

public static int func(int[]array){
//    给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
//    你可以假设数组是非空的，并且给定的数组总是存在多数元素。
    Arrays.sort(array);
    //由于多数元素出现次数超过一半，排序后中间位置的元素必定是多数元素。
    return array[array.length/2];

}
    public static void main(String[] args) {
        int[]array9 = {2,2,1,1,1,2,2};
        System.out.println(func(array9));
    }
}





















