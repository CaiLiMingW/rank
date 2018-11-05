package rank;

/**
 * @author Ccc
 * @date 2018/11/4 0004 下午 9:19
 * public class Selection_Sort <T extends Comparable<? super T>>
 * 选择排序 从左到右 把数组第一个元素依次与之后的元素相比较,最小的放在第一位
 * 任何数组情况下都是O（n*n）
 */
public class Selection_Sort  {
    public<T> void xx(T obj){

    }
    public static void sort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int tmp = arr[i];
            for (int j = i+1; j < arr.length ; j++) {
                if(tmp > arr [j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[10];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int) ( Math.random() *20 );
        }

        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"_");
            if (i==arr.length-1){
                System.out.println(arr[i]+"选择排序");
            }
        }
    }
}
