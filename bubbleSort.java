public class bubbleSort {

	 static void bubbleSort(int[] arraySort) {  
	        int n = arraySort.length;  
	        int bubble = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arraySort[j-1] > arraySort[j]){  
	                                 bubble = arraySort[j-1];  
	                                 arraySort[j-1] = arraySort[j];  
	                                 arraySort[j] = bubble;  
	                         }            
	                 }  
	         }  
	  
	    }  
	    public static void main(String[] args) {  
	                int array[] ={100,10,2,1,5,70,14};  
	                 
	                System.out.println("Array Unsorted:");  
	                for(int i=0; i < array.length; i++){  
	                        System.out.print(array[i] + " ");  
	                }  
	                System.out.println();  
	                  
	                bubbleSort(array);
	                 
	                System.out.println("Array Sorted:");  
	                for(int i=0; i < array.length; i++){  
	                        System.out.print(array[i] + " ");  
	                }  
	        }  
	}  