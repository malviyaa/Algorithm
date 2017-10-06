package insertionSort;

public class insertionSort {
public static void main(String[] args){
	int[] array = {29,45,11,30,12,55,33,97,43,76};
	int key,j;
	
	for(int i=1;i<array.length;i++){
		key = array[i];
		j=i;
		while(j>0&&array[j-1]>key){
			array[j]=array[j-1];
			j--;
		}
		array[j] = key;
	}
	
	for(int k=0;k<array.length;k++){
		System.out.println(array[k]);
	}
}
}
