package selectionSort;

public class selectionSort {
public static void main(String[] arg){
	int[] array = {29,45,11,30,12,55,33,97,43,76};
	int temp;
	for(int i=0;i<array.length-1;i++){
		for(int j=i+1;j<array.length;j++){
			if(array[i]>array[j]){
				temp = array[j];
				array[j]=array[i];
				array[i]=temp;
			}
			
		}
	}
	for(int k=0;k<array.length;k++)
		System.out.println(array[k]);
 }
}
