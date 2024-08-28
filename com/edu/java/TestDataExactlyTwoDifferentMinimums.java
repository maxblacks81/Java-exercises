package com.edu.java;

public class TestDataExactlyTwoDifferentMinimums {

	static int n;
	
	static int[] array = {10,20,30,40,50,60,70,80,90,80,70,40,10,20};
	
	static int[] get_array(){
		
		int[] temp_values;
		int[] unique_values;
		int[] min_values = new int[2];
		unique_values = TestDataUniqueValues.get_array();
		
		int first_min_idx = get_expected_result();
		min_values[0] = array[first_min_idx];
		
		temp_values = new int[unique_values.length-1];
		int j=0;
		for(int i=0; i<unique_values.length; i++) {
			if(i == first_min_idx)
				temp_values[j++] = unique_values[i];
		}
		
		int second_min_idx = get_expected_result();				
		min_values[1] = array[second_min_idx]; 
		
		return min_values;
		
	}
	
	static int get_expected_result() {
			
		int min_idx = 0;
        for (int i = 1; i < array.length; ++i) {
            if (array[i] < array[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
	}
}