package rank;

/**
 * @author Ccc
 * @date 2018/11/4 0004 下午 9:19
 * 冒泡排序 两两比较，最大的元素移动（冒泡）到尾端
 */
public class Bubble_Sort {
    public static void sort(int[] arr){
        int tmp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if (arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[10];

        for(int i=0;i<arr.length;i++){
            arr[i]=(int) ( Math.random() *20 );
        }

        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"_");
            if (i==arr.length-1){
                System.out.println(arr[i]+"冒泡排序");
            }
        }
    }
}
