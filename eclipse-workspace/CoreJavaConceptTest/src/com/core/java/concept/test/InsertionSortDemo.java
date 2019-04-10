package com.core.java.concept.test;

public class InsertionSortDemo {

	public static void main(String[] args) {
		
       int[] myArray  = {8,8,9,7};  //860 8 9 200
        
        System.out.println("Before Insertion Sort");  
        
        printArray(myArray);
        
        System.out.println();
        try {
        	   myArray=insertionSort(myArray);
        	    
        }
        catch (Exception e) {
        	e.printStackTrace();
            }
        System.out.println("After Insertion Sort");  
        
        printArray(myArray);
	}

	private static int[] insertionSort(int[] myArray) {
		int i,j, temp;
     	for(i=1; i< myArray.length ; i++)
		{   j=i;//3
    		temp=myArray[i];// 9
    		
    		System.out.println("Sort Pass Number "+(i)+ "   lenght= "+ myArray.length +" j= "+j);
			
		 while ((myArray[j-1]> temp )&& (j>0))
			{
			 System.out.println("Comparing "+ temp  + " and " + myArray [j-1]+ " j = " + j); 
                
			 myArray[j]=myArray[j-1];
			   j--;
			   System.out.print("Array from while "+myArray[0]); 
	            System.out.print(","+myArray[1]);
	            System.out.print(","+myArray[2]);
	            System.out.print(","+myArray[3]+"\n");   
			}
	        myArray[j]=temp;	
	        System.out.println("Swapping Elements: New Array After Swap");
            printArray(myArray); 
            System.out.println();
        
		}
		return myArray;
}
	private static void printArray(int[] array) {
		
		for(int i=0; i < array.length; i++)
		{  
			System.out.print(array[i] + " ");  
		} 
	    System.out.println();
	}
}	
/*         int n = arr.length;  

        for (int i = 1; i < n; i++)
        {   System.out.println("Sort Pass Number "+(i)+ "   lenght= "+ n);
            int key = arr[i];  
            int j = i-1;  
            
            while ( (j > -1)  && ( arr [j] > key ) ) 
            {  
            System.out.println("Comparing "+ key  + " and " + arr [j]+ " j = " + j); 
                arr [j+1] = arr [j];  
                j--;  
            System.out.print("Array from while "+arr[0]); 
            System.out.print(","+arr[1]);
            System.out.print(","+arr[2]);
            System.out.print(","+arr[3]+"\n");    
            }  
            arr[j+1] = key; 
            System.out.println("Swapping Elements: New Array After Swap");
            printArray(arr); 
            System.out.println();
        }
		return arr;
	
*/