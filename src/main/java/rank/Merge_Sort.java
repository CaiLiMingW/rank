package rank;

/**
 * @author Ccc
 * @date 2018/11/5 0005 下午 3:05
 */
public class Merge_Sort {
    public static void sort(int[] arr,int[] arrtmp,int left,int right){

        if(left < right){
            int center = (left + right) /2;
            System.out.print("分组-----左:arr["+left+","+center+"]");
            System.out.println("-----右:arr["+(center+1)+","+right+"]");
            sort(arr,arrtmp,left,center);

            sort(arr,arrtmp,center+1,right);
            sort1(arr,arrtmp,left,center+1,right);
        }
    }
    public static void sort1(int[] arr,int[] arrtmp,int leftstart,int rightstart,int rightend){
        int tmpstart = leftstart;
        int leftend = rightstart-1;
        int num = rightend - leftstart + 1 ;
        while (leftstart <= leftend && rightstart <= rightend ){
            System.out.println("arr["+leftstart+"]和"+"arr["+rightstart+"]");
            if (arr[leftstart] < arr[rightstart]){
                System.out.println("较小的元素放入新数组"+":arr["+leftstart+"]");
                arrtmp[tmpstart++] = arr[leftstart++];
            }else {
                System.out.println("较小的元素放入新数组"+":arr["+rightstart+"]");
                arrtmp[tmpstart++] = arr[rightstart++];
            }
        }
        while (leftstart <= leftend){
            System.out.println("剩余的元素放回数组"+":arr["+leftstart+"]");
            arrtmp[tmpstart++] = arr[leftstart++];

        }
        while (rightstart <= rightend){
            System.out.println("剩余的元素放回数组"+":arr["+rightstart+"]");
            arrtmp[tmpstart++] = arr[rightstart++];

        }
        for (int i = 0; i < num; i++,rightend--) {
            arr[rightend] = arrtmp[rightend];
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[16];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int) ( Math.random() *120 );
        }
        int[] arrtmp = new int[20];
        sort(arr,arrtmp,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {

            if (i==arr.length-1){
                System.out.println(arr[i]+"\n归并排序");
            }else {
                System.out.print(arr[i]+"_");
            }
        }
    }
}
