public class QuickSort {
    public static  void quickSort(int[] arr,int low,int high){
        if(low<high){
            int partitionIndex=partition(arr,low,high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high) {
        int pivot = arr[low];//设定基准为第一个元素
        int i=low+1;
        int j=high;
        while(i<=j){
            while (i<=j && arr[i] < pivot) {
                i++;
            }
            while(i<=j && arr[j] > pivot){
                j--;
            }
            if(i<=j){
                swap(arr,i,j);
                i++;
                j--;
            }
        }

        //一趟划分后i>j,交换基准元素和j
        swap(arr,low,j);
        return j;//返回分区索引。
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args){
        int[] arr={5,4,3,8,7,6};
        int n=arr.length;
        quickSort(arr,0,n-1);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
