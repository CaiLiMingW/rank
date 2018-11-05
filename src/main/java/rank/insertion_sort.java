package rank;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import javax.swing.plaf.basic.BasicEditorPaneUI;

/**
 * @author Ccc
 * @date 2018/11/4 0004 上午 8:46
 * 插入排序  有序区  无序区
 * 相比其他简单排序：若找到元素合适位置,可提前终止for循环
 * 最好：O(n) 近乎有序的情况
 * 最坏:O(n*n)
 */
public class insertion_sort {
    public static void sort(int[] arr) {
        int in;
        for (int out = 1; out < arr.length; out++) {
            int tmp = arr[out];
            //                     arr[1]<arr[0]
            for (in=out; in > 0 && arr[in] < arr[in-1] ; in--) {
                    arr[in] = arr[in-1];
                    arr[in-1] = tmp;
                //arr[in] = arr[in] ^ arr[in-1]
                //arr[in-1] = arr[in] ^ arr[in-1]
                //arr[in] = arr[in] ^ arr[in-1]
//                arr[in]^=arr[in-1];
//                arr[in-1]^=arr[in];
//                arr[in]^=arr[in-1];
            }
        }
    }

    //改进插入排序 不直接变换元素位置
    public static void sortv2(int[] arr) {
        int in;
        for (int out = 1; out < arr.length; out++) {
            //从无序组取出的元素,作为副本保存
            int tmp = arr[out];
            //将无序组取出的元素和有序组比较,
            for (in=out; in > 0 && tmp < arr[in-1] ; in--){
                //若前一位元素比取出的元素大,则后移一位
                arr[in] = arr[in-1];
            }
            //若一位比取出元素比取出元素小,把比较的元素填充进去
            arr[in] = tmp;
        }

    }
    public static void main(String[] args) {
        int[] arr=new int[20];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int) ( Math.random() *30 );
        }

        sortv2(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                System.out.println(arr[i]+"\n插入排序"+" arr.length = "+i);
            }else {
                System.out.print(arr[i]+"_");
            }

        }
    }


}
