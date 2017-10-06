
public class binarSearch {
public static void main(String args[]){
	int[] array = {29,45,11,30,12,55,33,97,43,76};
	boolean swap=true;
	int temp,j=0;
	try{
		
	while(swap){
		swap=false;
		j++;
		for(int i=0;i<array.length-j;i++){
			if(array[i]>array[i+1]){
				temp=array[i+1];
				array[i+1] = array[i];
				array[i] = temp;
				swap = true;
			}
		}
		
	}
	}catch(Exception ex){
		ex.printStackTrace();
	}
	System.out.println("The sorted array after Bubble Sort is");
	for(int k=0;k<array.length;k++)
		System.out.println(k+"-"+array[k]);
	}
}