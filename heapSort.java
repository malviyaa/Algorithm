
public class heapSort {
	private static int heapsize;
	public static void Heap_Sort(int A[]){
	BUILD_MAX_HEAP(A);
	for(int i=heapsize;i>=0;i--)
	{
		swap(A,0,i);
		heapsize--;
		MAX_HEAPIFY(A,0);	
	}
	}
	public static void BUILD_MAX_HEAP(int A[]){
		heapsize = A.length-1;
		for(int i=(heapsize/2);i>=0;i--){
			MAX_HEAPIFY(A,i);
		}
	}
	public static void MAX_HEAPIFY(int A[],int i){
		int left,right,largest=0;
		left = i*2+1;
		right = i*2+2;
		largest = i;
		if(left<=heapsize && A[left]>A[i])
			largest = left;
		if(right<=heapsize && A[right]>A[largest])
			largest = right;
		if(largest != i){
			swap(A,i,largest);
			MAX_HEAPIFY(A,largest);
		}
	}
	

	private static void swap(int[] a, int i, int largest) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i]=a[largest];
		a[largest] = temp;
		
	}
	public static void main(String args[]){
		int A[] = new int[]{4,1,3,2,16,9,10,14,8,7};
		Heap_Sort(A);
		for(int i=0;i<A.length;i++)
			System.out.println(A[i]);
	}
}
