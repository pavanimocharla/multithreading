public class InsertionSort{
public static void InsertionSort(int[]arr){
for(int i=1; i<arr.length; i++){
	int key=arr[i];
    int j=i-1;
    while(j>=0&&arr[j]>key){
	   arr[j+1]=arr[i];
	   j--;
  }
  arr[j+1]=key;
  }
 }
 public static void main(String[] args){
 int[]arr={5,3,1,4,2};
	 InsertionSort(arr);
	 for(int num:arr){
		 System.out.print(num +" ");
	 }
   }
}
