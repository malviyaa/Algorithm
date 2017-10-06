public class qSort{
	public static void main(String args[]){
		int A[] = {2,1,7,5,6,9,4};
		quickSort(A,0,A.length-1);
		for(int k=0;k<A.length;k++)
			System.out.println(A[k]);
		
	}
	static void quickSort(int[] A,int start,int end){
		int i=0;
		if(start>=end)
			return;
		i = partition(A,start,end);
		quickSort(A,start,i-1);
		quickSort(A,i+1,end);
		
	
	}
	private static int partition(int[] A, int start,int end) {
		// TODO Auto-generated method stub
		int key,index=start,temp,i;
		key = A[end];
		for(i=start;i<end;i++){
			if((A[i])<=key){
				temp=A[i];
				A[i]=A[index];
				A[index]=temp;
				index++;
			}
		}
		temp=A[end];
		A[end]=A[index];
		A[index]=temp;
		return index;
		
		
	}
}