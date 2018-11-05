package rank;

/**
 * @author Ccc
 * @date 2018/11/4 0004 下午 11:00
 */
public class shell_sort {
    public static void sort(int[] arr){
        int tmp ;
        for (int gap = arr.length/2; gap <0 ; gap /= 2) {
            for (int i = gap; i < arr.length ; i++) {
                for (int j = i; j >= gap && arr[j] < arr[j-gap] ; j-=gap) {
                    tmp = arr[i];
                    arr[j] = arr[j-gap];
                    arr[j] = tmp;
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

            if (i==arr.length-1){
                System.out.println(arr[i]+"选择排序");
            }else {
                System.out.print(arr[i]+"_");
            }
        }
    }
}
